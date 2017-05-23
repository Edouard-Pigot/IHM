package fr.univ_amu.iut.exercice9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloBeautifulUsefulButton extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello !");
        primaryStage.setWidth(250);
        primaryStage.setHeight(100);
        BorderPane borderPane = new BorderPane();
        Image image = new Image("https://raw.githubusercontent.com/IUTInfoAix-M2105/Syllabus/master/assets/logo.png");
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        Button button = new Button("Hello !", imageView);
        button.setId("buttonHello");
        EcouteurSimple ecouteurSimple = new EcouteurSimple();
        button.setOnAction(ecouteurSimple);
        //button.setText("Hello !");
        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("DarkTheme.css").toExternalForm());
        primaryStage.setHeight(250);
        primaryStage.setScene(scene);
        borderPane.setCenter(button);
        primaryStage.show();
    }
}
