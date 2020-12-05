/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import proyectoestructuras.Datos;

/**
 *
 * @author ADMIN
 */
public class GUI extends Application {
    
    @Override
    public void start(Stage primaryStage){
        Datos d = new Datos();
        Root r = new Root();
        Scene scene = new Scene(r.getRoot(), 700, 400);
        primaryStage.setTitle("Proyecto Estructuras");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
