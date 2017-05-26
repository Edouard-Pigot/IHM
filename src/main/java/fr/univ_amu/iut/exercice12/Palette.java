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
        panneau.setPrefSize(200,200);
        label = new Label("");
        vert = new Button("Vert");
        rouge = new Button("Rouge");
        bleu = new Button("Bleu");
        vert.setId("Vert");
        rouge.setId("Rouge");
        bleu.setId("Bleu");
        EventHandler<ActionEvent> ecouteurVert = event -> {
            ++nbVert;
            label.setText(vert.getText() + " choisi " + nbVert + " fois");
        };
        EventHandler<ActionEvent> ecouteurRouge = event -> {
            ++nbRouge;
            label.setText(rouge.getText() + " choisi " + nbRouge + " fois");
        };
        EventHandler<ActionEvent> ecouteurBleu = event -> {
            ++nbBleu;
            label.setText(bleu.getText() + " choisi " + nbBleu + " fois");
        };
        vert.setOnAction(ecouteurVert);
        rouge.setOnAction(ecouteurRouge);
        bleu.setOnAction(ecouteurBleu);
        haut = new HBox();
        haut.setAlignment(Pos.CENTER);
        haut.getChildren().add(vert);
        haut.getChildren().add(rouge);
        haut.getChildren().add(bleu);
        haut.setHgrow(vert, Priority.ALWAYS);
        haut.setHgrow(rouge, Priority.ALWAYS);
        haut.setHgrow(bleu, Priority.ALWAYS);
        bas = new HBox();
        bas.setAlignment(Pos.CENTER);
        bas.getChildren().add(label);
        bas.setHgrow(label, Priority.ALWAYS);
        root = new BorderPane();
        root.setTop(haut);
        root.setBottom(bas);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
};
