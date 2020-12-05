/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Vistas.VistaMalla;
import Vistas.VistaPilas;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import proyectoestructuras.Datos;

/**
 *
 * @author ADMIN
 */
public class Hilo extends Thread{
    public static String cad;
    private Slider s;
    private Button b1, b2, b3;
    public static boolean condicion;
    public static Double velocidad = 1.0;
    private static Cuadrito c;
    
    public Hilo(Slider s, Button b1, Button b2, Button b3){
        this.s = s;
        condicion = true;
        cad = "";
        this.b1=b1;
        this.b3=b3;
        this.b2=b3;
    }
    
    @Override
    public void run(){
        while(condicion){
            try {
                Cuadrito c1 = VistaMalla.getCuadrito(c.getX(), c.getY());
                if(cad.equals("play")){
                    Thread.sleep((long) (2000/velocidad));
                    System.out.println("velocidad: "+velocidad);
                }
                if(Malla.isVacio(c)){
                    c1.setColor(c.getC());
                    Platform.runLater(()->{
                        c.setText("(" + c.getX() +","+c.getY()+")");
                        VistaPilas.pushCuadrito(c);
                    });
                    if(cad.equals("next")){
                        condicion = false;
                    }
                }else if(Malla.izqVacio(c1)){
                    c = new Cuadrito(c.getX(), c.getY()-1, c.getC());
                }else if(Malla.derVacio(c1)){
                    c = new Cuadrito(c.getX(), c.getY()+1, c.getC());
                }else if(Malla.arrVacio(c1)){
                    c = new Cuadrito(c.getX()-1, c.getY(), c.getC());
                }else if(Malla.abjVacio(c1)){
                    c = new Cuadrito(c.getX()+1, c.getY(), c.getC());
                }else{
                    if(!Datos.pill.isEmpty()){
                        Platform.runLater(()->{
                            c = VistaPilas.popCuadrito();
                        });
                        if(cad.equals("next")){
                            condicion = false;
                        }
                    }else{
                        condicion = false;
                    }
                }
            } catch (InterruptedException ex) {
                System.out.println("Error en run() Hilo");
                System.out.println(ex.toString());
            }
        }
        if(Datos.pill.isEmpty()){
            b1.setDisable(false);
            b2.setDisable(false);
            b3.setDisable(false);
        }
    }
    
    public static void sendValues(String s){
        if(s != null && !"".equals(s)){
            String[] s1 = s.split(",");
            int x = Integer.valueOf(s1[0]);
            int y = Integer.valueOf(s1[1]);
            int colo = Integer.valueOf(s1[2]);
            c = new Cuadrito(x,y,colo);
        }
    }
    
}
