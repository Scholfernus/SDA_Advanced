package pl.sdajavapol141.Task30;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;


public class Task30App extends Application {
    GridPane root;
    Scene scene;
    Path sourceFile;
    Stage stage;
    TextArea area;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        root = new GridPane();
        createLayout(root);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Reverse content file ...");
        stage.setResizable(false);
        stage.show();

    }

    private void createLayout(GridPane pane) {
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setPadding(new Insets(10));
        var loadBtn = new Button("Load ...");
        loadBtn.setMinWidth(120);
        loadBtn.setOnMouseClicked(this::setOnClickLoadBtn);
        pane.add(loadBtn, 0, 0);
        var saveBtn = new Button("Save reversed ...");
        saveBtn.setMinWidth(120);
        saveBtn.setOnMouseClicked(this::setOnClickSaveBtn);
        pane.add(saveBtn, 1, 0);
        area = new TextArea("zawartość pliku ...");
        area.setMinWidth(250);
        area.setMaxWidth(250);
        pane.add(area, 0, 1, 2, 1);
    }

    private void setOnClickLoadBtn(MouseEvent event) {
        FileChooser chooser = new FileChooser();
        final File file = chooser.showOpenDialog(stage);
        if (file == null) {
            // przycisk anuluj
            // mie wybrał pliku
            // brak takiego pliku
            return;
        }
        sourceFile = Path.of(file.getAbsolutePath());
        System.out.println(sourceFile);
        try {
            area.clear();
            //   StringBuilder contentBuilder = new StringBuilder();
            //        Files.readAllLines(sourceFile).forEach(line -> {
            //            contentBuilder.append(line).append(System.lineSeparator());
            //        });
            //        area.setText(contentBuilder.toString());
            //    } catch (IOException e) {
            //        throw new RuntimeException(e);
            //    }
            Files.readAllLines(sourceFile).forEach(line -> {
                area.appendText(line);
                area.appendText(System.lineSeparator());
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setOnClickSaveBtn(MouseEvent event) {
        String content = area.getText();
        content = reverse(content);
        final String fileName = sourceFile.getFileName().toString();
        final int i = fileName.lastIndexOf(".");
        System.out.println(fileName.lastIndexOf("."));
        final String ext = fileName.substring(i + 1);
        final String fileNameWithoutExtension = fileName.substring(0, i);
        String reversedFileName = reverse(fileNameWithoutExtension) + "." + ext;
        System.out.println(sourceFile.getParent());//pokazuje ścieżkę gdzie zapisuje plik
        Path targetPath = Path.of(sourceFile.getParent().toString(), reversedFileName);
        try {
            Files.writeString(targetPath, content);
        } catch (IOException e) {
            throw new RuntimeException();
        }
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle("Wynik odwrócenia");
//        alert.setContentText(content);
//        alert.show();
    }

    private String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}


