/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javafx.scene.layout.BorderPane;

public class Root {
    private BorderPane root;

    public Root(){
        root = new BorderPane();
        VistaBotones vb = new VistaBotones();
        VistaMalla vm = new VistaMalla();
        VistaPilas vp = new VistaPilas();
        root.setBottom(vb.getBotones());
        root.setCenter(vm.getMalla());
        root.setLeft(vp.getPilas());
        
    }

    public BorderPane getRoot() {
        return root;
    }    
 
}
