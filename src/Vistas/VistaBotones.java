
package Vistas;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.HBox;

public class VistaBotones {
    private HBox botones;
    private ScrollBar scroll;
    private Button b1;
    private Button b2;
     
    public VistaBotones(){
        botones = new HBox();
        scroll = new ScrollBar();
        scroll.setOrientation(Orientation.HORIZONTAL);
        b1 = new Button("play");
        b2 = new Button("next");
        botones.setSpacing(30);
        botones.getChildren().addAll(scroll, b1, b2);
        
        b1.setOnMouseClicked((e)->{
            
        });
        
        b2.setOnMouseClicked((e)->{
        
        });
    }

    public HBox getBotones() {
        return botones;
    }
    
    
}
