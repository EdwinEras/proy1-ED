/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author DELL-USER
 */
public class Backtracing {
    public Stack<Cuadrito> pill = new Stack();
    public Cluster cuadros;
    public Malla m;

    public Backtracing(Cluster cuadros,Malla m) {
        this.cuadros = cuadros;
        this.m=m;
    }
    
    public void pintarCuadritos(){
        ArrayList<Cuadrito> c = cuadros.getPixeles();
        pill.push(c.get(0));
        do{
            Cuadrito a = pill.peek();
            Cuadrito b;
            if(m.derVacio(a)){
                b = new Cuadrito(a.getX(),a.getY()+1,a.getColor());
                pill.push(b);
            }else if(m.arrVacio(a)){
                b = new Cuadrito(a.getX()-1,a.getY(),a.getColor());
                pill.push(b);
            }else if(m.izqVacio(a)){
                b = new Cuadrito(a.getX(),a.getY()-1,a.getColor());
                pill.push(b);
            }else if(m.abjVacio(a)){
                b = new Cuadrito(a.getX()+1,a.getY(),a.getColor());
                pill.push(b);
            }else{
                pill.pop();
            }
        }while(!pill.isEmpty());
    }

    
}
