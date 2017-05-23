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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
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
        panneau.setPrefSize(400,200);
        haut.setAlignment(Pos.CENTER);
        bas.setAlignment(Pos.CENTER);
        Button buttonV = new Button("Vert");
        buttonV.setId("Vert");
        EventHandler<ActionEvent> ecouteurVert = event -> {
            ++nbVert;
            panneau.setStyle("-fx-background-color: green");
        };
        buttonV.setOnAction(ecouteurVert);

        Button buttonR = new Button("Rouge");
        buttonR.setId("Rouge");
        EventHandler<ActionEvent> ecouteurRouge = event -> {
            ++nbRouge;
            panneau.setStyle("-fx-background-color: red");
        };
        buttonR.setOnAction(ecouteurRouge);

        Button buttonB = new Button("Bleu");
        buttonB.setId("Bleu");
        EventHandler<ActionEvent> ecouteurBleu = event -> {
            ++nbBleu;
            panneau.setStyle("-fx-background-color: blue");
        };
        buttonB.setOnAction(ecouteurBleu);
    }
}
