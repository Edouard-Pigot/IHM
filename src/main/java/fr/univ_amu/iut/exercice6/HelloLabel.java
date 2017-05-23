package fr.univ_amu.iut.exercice6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javafx.scene.control.Label;

public class HelloLabel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello !");
        primaryStage.setWidth(250);
        primaryStage.setHeight(100);
        BorderPane borderPane = new BorderPane();
        Label label = new Label();
        label.setId("labelHello");
        label.setText("Hello !");
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        borderPane.setCenter(label);
        primaryStage.show();

    }
}
