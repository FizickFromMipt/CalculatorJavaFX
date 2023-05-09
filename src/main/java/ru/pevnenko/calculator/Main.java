package ru.pevnenko.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class Main extends Application {
    //Кнопки
    static Button one = new Button("1");
    static Button two = new Button("2");
    static Button three = new Button("3");
    static Button four = new Button("4");
    static Button five = new Button("5");
    static Button six = new Button("6");
    static Button seven = new Button("7");
    static Button eight = new Button("8");
    static Button nine = new Button("9");
    static Button plus = new Button("+");
    static Button equals = new Button("=");
    static AtomicReference<Integer> res = new AtomicReference<>(0);
    static Text result =  new Text(res.toString());



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        int length = 400;
        int width = 800;

        //Текстовое поле для вывода резултата
        result.setFont(new Font(20));

        //Настройка сетки
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        //Расположение обьектов на сетке
        gridPane.add(Controller.one, 0, 0);
        gridPane.add(two, 1, 0);
        gridPane.add(three, 2, 0);
        gridPane.add(four, 0, 1);
        gridPane.add(five, 1, 1);
        gridPane.add(six, 2, 1);
        gridPane.add(seven, 0, 2);
        gridPane.add(eight, 1, 2);
        gridPane.add(nine, 2, 2);
        gridPane.add(plus, 0, 3);
        gridPane.add(equals, 1, 3);
        gridPane.add(result, 5,5);

        Group root = new Group();
        root.getChildren().addAll(gridPane);



        Scene scene  = new Scene(root,width, length);

        stage.setScene(scene);
        stage.setTitle("Калькулятор");
        stage.show();

    }
}
