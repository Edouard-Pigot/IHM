package fr.univ_amu.iut.exercice11;

import fr.univ_amu.iut.exercice9.EcouteurSimple;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloBeautifulUsefulButton extends Application {
    private int nbAction = 0;

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
        EventHandler<ActionEvent> ecouteur = event -> {
                ++nbAction;
                System.out.println("Bouton actionné " + nbAction + " fois");
        };
        button.setOnAction(ecouteur);
        //button.setText("Hello !");
        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("DarkTheme.css").toExternalForm());
        primaryStage.setHeight(250);
        primaryStage.setScene(scene);
        borderPane.setCenter(button);
        primaryStage.show();
    }
}
