package pl.sdajavapol141.Task32;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task32App extends Application {
    Stage stage;
    Scene scene;
    GridPane root;
    List<Book> books = new ArrayList<>();
    TextField bookTitle;
    TextField bookAuthor;
    TextField bookEditionYear;
    TextField bookCopies;
    ListView<Book> booksView;

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
        stage.show();
        // początek wyświetla nam przycisk w oknie komunikacji
    }

    private void createLayout(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        // pane.setMinWidth(400);
        pane.add(new Label("Tytuł "), 0, 0);
        bookTitle = new TextField();
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("Author "), 0, 1);
        bookAuthor = new TextField();
        pane.add(bookAuthor, 1, 1);
        pane.add(new Label("Rok wydania "), 0, 2);
        bookEditionYear = new TextField();
        pane.add(bookEditionYear, 1, 2);
        pane.add(new Label("Liczba kopi "), 0, 3);
        bookCopies = new TextField();
        pane.add(bookCopies, 1, 3);

        Button addBooksBtn = new Button("Dodaj");
        addBooksBtn.setOnMouseClicked(this::setOnMouseAddClicked);
        Button saveBooksBtn = new Button("Zapisz");
        saveBooksBtn.setOnMouseClicked(this::setOnMouseSaveClicked);
        Button loadBooksBtn = new Button("Wczytaj");
        loadBooksBtn.setOnMouseClicked(this::setOnMousseLoadClicked);

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);


        pane.add(addBooksBtn, 0, 4, 2, 1);
        pane.add(saveBooksBtn, 0, 6, 2, 1);
        pane.add(loadBooksBtn, 0, 5, 2, 1);

        booksView = new ListView<>();
        booksView.setMinWidth(500);
        pane.add(booksView, 0, 7, 2, 1);
        booksView.getItems().add(Book
                .builder()
                .title("Java")
                .author("Bloch")
                .copies(2)
                .editionYear(2020)
                .build()
        );
    }

    private void setOnMouseAddClicked(MouseEvent event) {
        final int editionYear = Integer.parseInt((bookEditionYear.getText()));
        final String title = bookTitle.getText();
        final String author = bookAuthor.getText();
        final int copies = Integer.parseInt(bookCopies.getText());
        Book book = Book
                .builder()
                .title(title)
                .author(author)
                .editionYear(editionYear)
                .copies(copies)
                .build();
        booksView.getItems().add(book);
    }

    private void setOnMouseSaveClicked(MouseEvent event) {
        FileChooser chooser = new FileChooser();
        File file = chooser.showSaveDialog(stage);
        if (file == null ){
            return;
        }
        Path path = Paths.get(file.getAbsolutePath());
        try {
            Files.writeString(path, booksView
                    .getItems()
                    .stream()
                    .map(book -> book.toString())
                    .collect(Collectors.joining(System.lineSeparator()
                    )));
        } catch (IOException e) {
            System.err.println(e);
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Zapis do pliku nie powiódł się !");
            alert.show();
        }

    }

    private void setOnMousseLoadClicked(MouseEvent event) {
    FileChooser chooser = new FileChooser();
    File file = chooser.showOpenDialog(stage);
        if (file == null ){
            return;
        }
        Path path = Paths.get(file.getAbsolutePath());
        try {
            Files.lines(path)
                    .map(line->{
                        line = line.replace("\t", "\n");
                        Scanner scanner = new Scanner(line);
                        String title = "";
                        String author = "";
                        int editionYear = 0;
                        int copies = 0;
                       if (scanner.hasNextLine()){
                           title = scanner.nextLine();
                       }else {
                           return null;
                       }
                       if (scanner.hasNextLine()){
                           author = scanner.nextLine();
                       }else {
                           return null;
                       }
                        if (scanner.hasNextLine()){
                            editionYear = scanner.nextInt();
                        }else {
                            return null;
                        }
                        if (scanner.hasNextLine()){
                            copies = scanner.nextInt();
                        }else {
                            return null;
                        }
                       return Book.builder().title(title).author(author).editionYear(editionYear).copies(copies).build();
//                        String[] tokens = line.split("\\t");
                    })
                    .toList();
            booksView.getItems().clear();
            booksView.getItems().addAll(books);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
