package fr.univ_amu.iut.exercice12;

import fr.univ_amu.iut.exercice9.EcouteurSimple;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Label label;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private HBox haut;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello !");
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);
        vert = new Button("Vert");
        rouge = new Button("Rouge");
        bleu = new Button("Bleu");
        vert.setId("Vert");
        rouge.setId("Rouge");
        bleu.setId("Bleu");
        //EcouteurSimple ecouteurSimple = new EcouteurSimple();
        EventHandler<ActionEvent> ecouteurVert = event -> {
            ++nbVert;
            System.out.println("Bouton vert" + nbVert);
        };
        EventHandler<ActionEvent> ecouteurRouge = event -> {
            ++nbRouge;
            System.out.println("Bouton rouge" + nbRouge);
        };
        EventHandler<ActionEvent> ecouteurBleu = event -> {
            ++nbBleu;
            System.out.println("Bouton bleu" + nbBleu);
        };
        vert.setOnAction(ecouteurVert);
        rouge.setOnAction(ecouteurRouge);
        bleu.setOnAction(ecouteurBleu);
        primaryStage.setHeight(250);

        haut = new HBox();
        haut.setAlignment(Pos.CENTER);
        haut.getChildren().add(vert);
        haut.getChildren().add(rouge);
        haut.getChildren().add(bleu);
        haut.setHgrow(vert, Priority.ALWAYS);
        haut.setHgrow(rouge, Priority.ALWAYS);
        haut.setHgrow(bleu, Priority.ALWAYS);
//        HBox.setHgrow(rouge, Priority.ALWAYS);
//        HBox.setHgrow(bleu, Priority.ALWAYS);*/
//        haut.getChildren().addAll(vert, rouge, bleu);
//        root.setTop(haut);
        root = new BorderPane();
        root.setTop(haut);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
};
