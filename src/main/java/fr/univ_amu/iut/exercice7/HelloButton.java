package fr.univ_amu.iut.exercice7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloButton extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello !");
        primaryStage.setWidth(250);
        primaryStage.setHeight(100);
        BorderPane borderPane = new BorderPane();
        Button button = new Button();
        button.setId("buttonHello");
        button.setText("Hello !");
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        borderPane.setCenter(button);
        primaryStage.show();
    }
}
