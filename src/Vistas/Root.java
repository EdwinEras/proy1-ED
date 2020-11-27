/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author ADMIN
 */
public class Root {
    private BorderPane root;
    private VBox botones;
    private HBox pilas;
    
    
    public Root(){
        root = new BorderPane();
        botones = new VBox();
        pilas = new HBox();
        setupBotones();
        setupPilas();
        root.setBottom(botones);
        root.setLeft(pilas);
    }

    public BorderPane getRoot() {
        return root;
    }    
    
    public void setupBotones(){
        Button b1 = new Button("Cargar");
        Button b2 = new Button("Siguiente");
        botones.getChildren().addAll(b1, b2);
        
        b1.setOnMouseClicked((e)->{
        
        });
        
        b2.setOnMouseClicked((e)->{
        
        });
    }
    
    public void setupPilas(){
        
    }
}
