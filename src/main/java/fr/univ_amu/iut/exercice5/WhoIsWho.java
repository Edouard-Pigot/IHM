package fr.univ_amu.iut.exercice5;

import javafx.application.Application;
import javafx.stage.Stage;

import static java.lang.Thread.currentThread;

public class WhoIsWho extends Application {

    public WhoIsWho() {
        System.out.println("[" + currentThread().getName() + "] constructeur ApplicationLifeCycle()");
    }

    public static void main(String[] args) {
        System.out.println("main() : avant launch");
        launch(args);
        System.out.println("main() : après launch");
    }

    @Override
    public void init() throws Exception {
        System.out.println("init()");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop()");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("WhoIsWho");
        System.out.println("[" + currentThread().getName() + "] start()");
        primaryStage.show();
    }
}
