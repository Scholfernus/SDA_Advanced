package pl.sdajavapol141.Task10e;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventTarget;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static javafx.application.Application.launch;

public class Task10App extends Application {
    Group root;
    Scene scene;
    Ball ball;
    List<Ball> balls = new ArrayList<>();
    String letter = "Q";
    Text info = new Text("Liczba punktów 0");
    int points = 0;
    ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        root = new Group();
        scene = new Scene(root, 600, 800);
        ball = new Ball(30, "ball", Color.BLUE);
        root.getChildren().add(ball);
        balls = new ArrayList<>(IntStream.range(0, 100).mapToObj(i -> Ball.random(scene.getWidth(),
                scene.getHeight())).peek(ball1 -> ball1.setOnMouseClicked(this::handleBall)).toList());
        info.setLayoutY(20);
        info.setLayoutX(10);
        root.getChildren().addAll(balls);
        root.getChildren().add(info);
        stage.setScene(scene);
        stage.setTitle("Bouncing ball");
        stage.setResizable(false);
        stage.show();
        stage.setOnCloseRequest(e -> executor.shutdown());
        ball.setSpeedX(3);
        ball.setSpeedY(2);
        executor.scheduleAtFixedRate(this::animateBalls, 0, 20, TimeUnit.MILLISECONDS); //zamiast lambdy jest this::
        scene.setOnKeyPressed(this::handleKeys);
//        scene.setOnMouseClicked(e->{e.});
    }

    public void handleBall(MouseEvent event) {
        Object source = (Ball) event.getSource();
        if (!(source instanceof Ball)) {
            return;
        }
        Ball ball = (Ball) source;
        ball.getCircle().setFill(Color.BLACK);
        String text = ball.getText().getText();
        if (Objects.equals(text, letter)) {
            points++;
            info.setText("Liczba punktów: " + points);
        }
    }

    public void handleKeys(KeyEvent event) {
        switch (event.getCode()) {
            case A:
                List<Ball> removed = balls.stream().filter(ballToRemove -> ballToRemove.getCircle()
                        .getRadius() > 20).toList();
                balls.removeAll(removed);
                root.getChildren().removeAll(removed);
                break;
            case B:
                List<String> strings = balls.stream().map(ballText -> ballText.getText().getText())
                        .distinct().sorted().toList();
                System.out.println(strings);
                break;
            case C:
                Map<String, List<String>> letters = balls.stream().map(ballText -> ballText.getText()
                        .getText()).sorted().collect(Collectors.groupingBy(s -> s));
                System.out.println(letters);
                String word = " Kal".toUpperCase();
                Map<String, List<String>> wordLetters = word.chars().mapToObj(c -> (char) (c) + " ")
                        .collect(Collectors.groupingBy(Function.identity()));
                boolean isWord = true;
                for (var letter : wordLetters.entrySet()) {
                    if (!letters.containsKey(letter.getKey()) || letter.getValue().size() <= letters.get(letter.getKey()).size()) {
                        isWord = false;
                        break;
                    }
                }
                System.out.println("Słowo " + word + " składa się z literą w kulkach ? " + isWord);
            case Q:
                executor.shutdown();
                Platform.exit();
        }
    }

    public void animateBalls() {
        balls.forEach(this::animateBall); //(ball->animateBall(ball); - można też w ten sposób - REFERENCJA DO METODY
        //Referencja - wskaźnik, adres
    }

    public void animateBall(Ball currentBall) {
        if (currentBall.getLayoutX() + currentBall.getWidth() > scene.getWidth()) {
            currentBall.setSpeedX(-currentBall.getSpeedX());
        }

        if (currentBall.getLayoutX() < 0) {
            currentBall.setSpeedX(-currentBall.getSpeedX());
        }
        if (currentBall.getLayoutY() + currentBall.getWidth() > scene.getHeight()) {
            currentBall.setSpeedY(-currentBall.getSpeedY());
        }

        if (currentBall.getLayoutY() < 0) {
            currentBall.setSpeedY(-currentBall.getSpeedY());
        }
        Platform.runLater(() -> {
//
            currentBall.move();
        });
    }
}