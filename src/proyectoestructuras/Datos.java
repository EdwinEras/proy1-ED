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
import java.util.Stack;

public class Datos {
    public static Malla malla;
    public static Stack pill;

    public Datos(){
        malla = new Malla("Cuadro.txt");
        pill = new Stack();
        int[][] m = malla.getMalla();
        for (int i=0; i<m.length ;i++ ){
            for (int j = 0; j<m[i].length; j++){
                if(m[i][j]==0){
                    Cuadrito c = new Cuadrito(i,j,WHITE);
                }else if(m[i][j]==1){
                    Cuadrito c = new Cuadrito(i,j,RED);
                }
                }else if(m[i][j]==2){
                    Cuadrito c = new Cuadrito(i,j,GREEN);
                }
                }else if(m[i][j]==3){
                    Cuadrito c = new Cuadrito(i,j,RED);
                }
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
