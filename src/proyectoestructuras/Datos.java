/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuras;

import Clases.Cuadrito;
import Clases.Malla;
import com.sun.prism.paint.Color;
import static com.sun.prism.paint.Color.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;

public class Datos {
    public static Malla malla;
    public static Stack pill;

    public Datos(){
        malla = new Malla("Cuadro.txt");
        pill = new Stack();
        Map<Color, ArrayList<Cuadrito>> colorCuadritos = new HashMap<>();
        colorCuadritos.put(WHITE,new ArrayList<>());colorCuadritos.put(RED,new ArrayList<>());
        colorCuadritos.put(GREEN,new ArrayList<>());colorCuadritos.put(BLUE,new ArrayList<>());
        int[][] m = malla.getMalla();
        for (int i=0; i<m.length ;i++ ){
            for (int j = 0; j<m[i].length; j++){
                Cuadrito c = null;
                switch (m[i][j]) {
                    case 0:
                        c = new Cuadrito(i,j,WHITE);
                        break;
                    case 1:
                        c = new Cuadrito(i,j,RED);
                        break;
                    case 2:
                        c = new Cuadrito(i,j,GREEN);
                        break;
                    case 3:
                        c = new Cuadrito(i,j,BLUE);
                        break;
                    default:
                        break;
                }
                colorCuadritos.get(c.getColor()).add(c);
            }            
        }
        System.out.println(malla);
        /*ESTOS METODOS DEBEN IR EN EL MAIN
        pill.push(new Cuadrito(2, 2, Color.BLUE));
        pill.push(new Cuadrito(0, 12, Color.GREEN));
        pill.push(new Cuadrito(8, 4, Color.RED));
        System.out.println(" "); 
        */
        System.out.println(malla);
    }

    public static Malla getMalla() {
        return malla;
    }

    public static Stack getPila() {
        return pill;
    }
    
    
}
