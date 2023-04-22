package pl.sdajavapol141.Task11Excercise;

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
import pl.sdajavapol141.Task10e.Ball;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class SDABallApp extends Application{
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

    }
}
