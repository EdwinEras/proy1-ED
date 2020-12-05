/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.sun.prism.paint.Color;
import java.util.ArrayList;

/**
 *
 * @author DELL-USER
 */
public class Cluster {
    private Color color;
    private int tamanio;
    private ArrayList<Cuadrito> pixeles;

    public Cluster(ArrayList<Cuadrito> pixeles) {
        this.color = pixeles.get(0).getColor();
        this.pixeles = pixeles;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<Cuadrito> getPixeles() {
        return pixeles;
    }

    public void setPixeles(ArrayList<Cuadrito> pixeles) {
        this.pixeles = pixeles;
    }
    
    
    
}
