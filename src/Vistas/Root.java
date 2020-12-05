/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javafx.scene.layout.BorderPane;

public class Root {
    private BorderPane root;
    VistaBotones vb;
    VistaMalla vm;
    VistaPilas vp;

    public Root(){
        root = new BorderPane();
        vb = new VistaBotones();
        vm = new VistaMalla();
        vp = new VistaPilas();
        root.setBottom(vb.getBotones());
        root.setRight(vm.getMalla());
        root.setLeft(vp.getPilas());        
    }

    public BorderPane getRoot() {
        return root;
    }    

    public VistaBotones getVb() {
        return vb;
    }
    
    
}
