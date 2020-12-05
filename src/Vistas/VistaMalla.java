
package Vistas;

import Clases.Cuadrito;
import Clases.Malla;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;


public class VistaMalla{
    private static GridPane malla;
    
    public VistaMalla(){
        malla = new GridPane();
        try {
            Malla.crearMalla();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(VistaMalla.class.getName()).log(Level.SEVERE, null, ex);
            exit(-1);
        }
    }

    public GridPane getMalla() {
        return malla;
    }
    
    public static void addCuadrito(Cuadrito c){
        malla.add(c, c.getY(), c.getX());
    }
    
    public static Cuadrito getCuadrito(int row, int column) {
    Node result = null;
    ObservableList<Node> childrens = malla.getChildren();
    for (Node node : childrens) {
        if(malla.getRowIndex(node) == row && malla.getColumnIndex(node) == column){
            result = node;
            break;
            }
        }
    return (Cuadrito)result;
    }
    
}
