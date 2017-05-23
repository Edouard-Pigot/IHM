package fr.univ_amu.iut.exercice9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurSimple implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Bouton actionné");
    }
}
