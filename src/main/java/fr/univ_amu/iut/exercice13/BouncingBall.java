package fr.univ_amu.iut.exercice13;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import jdk.nashorn.internal.runtime.Undefined;

public class BouncingBall extends Application {

    private Button startButton = new Button("Start");
    private Button pauseButton = new Button("Pause");
    private Button resumeButton = new Button("Resume");
    private Button stopButton = new Button("Stop");
    private Slider slider = new Slider();
    private Circle circle = new Circle();
    private VBox root = new VBox();
    private HBox commands = new HBox();
    private Pane pane = new Pane();
    private TranslateTransition transition = new TranslateTransition();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Bouncing ball");
        stage.setWidth(400);
        stage.setHeight(500);
        pane.setPrefSize(400,450);
        EventHandler<ActionEvent> ecouteurStart = event -> {
            transition.playFromStart();
        };
        startButton.setOnAction(ecouteurStart);
        EventHandler<ActionEvent> ecouteurPause = event -> {
            transition.pause();
        };
        pauseButton.setOnAction(ecouteurPause);
        EventHandler<ActionEvent> ecouteurResume = event -> {
            transition.play();
        };
        resumeButton.setOnAction(ecouteurResume);
        EventHandler<ActionEvent> ecouteurStop = event -> {
            transition.stop();
        };
        stopButton.setOnAction(ecouteurStop);
        slider.setMin(0.1);
        slider.setMax(5);
        slider.valueProperty().addListener(
                (observable, oldValue, newValue) -> transition.setRate(newValue.doubleValue())
        );
        circle.setCenterX(200);
        circle.setCenterY(10);
        circle.setRadius(10);
        circle.setFill(Color.BLUE);
        transition.setFromY(10);
        transition.setToY(400);
        transition.setDuration(new Duration(1000));
        transition.setAutoReverse(true);
        transition.setCycleCount(Animation.INDEFINITE);
        transition.setNode(circle);
        transition.setRate(slider.getValue());
        commands.setAlignment(Pos.CENTER);
        commands.getChildren().addAll(startButton, pauseButton, resumeButton, stopButton);
        pane.getChildren().add(circle);
        root.getChildren().addAll(commands, slider, pane);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
