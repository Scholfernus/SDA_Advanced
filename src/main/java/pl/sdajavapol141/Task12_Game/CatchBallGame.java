package pl.sdajavapol141.Task12_Game;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CatchBallGame extends Application {
    private final int NUM_OF_BALLS = 10;
    private final int INITIAL_POINTS = 0;
    private final int POINTS_PER_BALL = 10;
    private final int SPEED_CHANGE_INTERVAL = 10;
    private final double SLOW_SPEED = 1.0;
    private final double MEDIUM_SPEED = 3.0;
    private final double FAST_SPEED = 5.0;
    private final int POINTS_CHANGE_INTERVAL = 10;
    private final int FIRST_POINTS = 10;
    private final int SECOND_POINTS = 5;
    private final int THIRD_POINTS = 2;
    private final int WINDOW_WIDTH = 600;
    private final int WINDOW_HEIGHT = 400;
    private final int DELAY = 20;
    private final Text scoreText = new Text("Score: " + INITIAL_POINTS);
    private int score = INITIAL_POINTS;
    private final List<BallGame> balls = new ArrayList<>();
    private final Pane root = new Pane();
    private final Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
    private final Text scoreLabel = new Text("Score: " + INITIAL_POINTS);
    private boolean gameStarted = false;
    private final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    @Override
    public void start(Stage stage) {
        stage.setScene(scene);

        Random random = new Random();
        for (int i = 0; i < NUM_OF_BALLS; i++) {
            BallGame ball = new BallGame(20, "Catch Me", Color.RED, new Group());
            ball.setTranslateX(random.nextInt(WINDOW_WIDTH - 40) + 20);
            ball.setTranslateY(random.nextInt(WINDOW_HEIGHT - 40) + 20);
            root.getChildren().add(ball);

            ball.setOnMouseClicked(event -> {
                if (ball.isCaught()) {
                    score += POINTS_PER_BALL;
                    scoreLabel.setText("Score: " + score);
                }
                root.getChildren().remove(ball);
            });

            balls.add(ball);
        }

        scoreText.setText("Score: " + score);
    }
}