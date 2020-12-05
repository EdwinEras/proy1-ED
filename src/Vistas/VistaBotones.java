
package Vistas;

import Clases.Hilo;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class VistaBotones{
    private HBox botones;
    private Slider scroll;
    private Button b1;
    private Button b2;
    private Button b3;
    private Hilo h1;
    private TextField t1;
    private Label lb;
     
    public VistaBotones(){
        botones = new HBox();
        scroll = new Slider(0.5, 3, 1.75);
        scroll.setOrientation(Orientation.HORIZONTAL);
        b1 = new Button("play");
        b3 = new Button("stop");
        b3.setDisable(true);
        b2 = new Button("next");
        t1 = new TextField();
        lb = new Label("<--  x,y,c\nx,y son coordenadas\nc es color de 1:5");
        botones.setSpacing(30);
        botones.getChildren().addAll(scroll, b1, b3, b2, t1, lb);
        
        b1.setOnMousePressed((MouseEvent e) -> {
            if(b1.isPressed()){
                h1 = new Hilo(scroll, b1, b2, b3);
                Hilo.sendValues(t1.getText());
                Hilo.cad = b1.getText();
                t1.clear();
                b1.setDisable(true);
                b3.setDisable(false);
                b2.setDisable(true);
                h1.start();
                
            }
        });
        
        b3.setOnMousePressed((MouseEvent e) -> {
            if(b3.isPressed() ){
                Hilo.condicion = false;
                b1.setDisable(false);
                b3.setDisable(true);
                b2.setDisable(false);
                
            }
        });
        
        b2.setOnMousePressed((MouseEvent e) -> {
            if(b2.isPressed()){
                h1 = new Hilo(scroll, b1, b2, b3);
                Hilo.sendValues(t1.getText());
                Hilo.cad = b2.getText();
                t1.clear();
                //b1.setDisable(true);
                b3.setDisable(true);
                h1.start();
                
            }
        });
        

        scroll.setMajorTickUnit(0.5);
        scroll.setShowTickMarks(true);
        scroll.setShowTickLabels(true);
        scroll.setSnapToTicks(true);
        scroll.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                Hilo.velocidad = scroll.getValue();
            }
        });
        
    }

    public HBox getBotones() {
        return botones;
    }

}
