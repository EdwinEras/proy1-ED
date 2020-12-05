
package Vistas;

import Clases.Cuadrito;
import javafx.scene.layout.VBox;
import proyectoestructuras.Datos;

public class VistaPilas {
    private static VBox pilas;
    private static int tamanio;
    
    public VistaPilas(){
        pilas = new VBox();
        tamanio = 0;
    }

    public VBox getPilas(){
        return pilas;
    }
    
    public static void pushCuadrito(Cuadrito c){
        Datos.pill.push(c);
        pilas.getChildren().add(c);
        tamanio = pilas.getChildren().size();
    }

    public static int getTamanio(){
        return tamanio;
    }

    public static Cuadrito popCuadrito(){
        pilas.getChildren().remove(tamanio-1);
        tamanio = pilas.getChildren().size();
        return (Cuadrito)Datos.pill.pop();
    }
    
}
