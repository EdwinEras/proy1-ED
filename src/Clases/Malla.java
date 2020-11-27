
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Malla {
    private int[][] malla;
    
    public Malla(String txt){
        try{
            File archivo = new File(txt);
            FileReader fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);
            int filas = Integer.valueOf(br.readLine());
            int columnas = Integer.valueOf(br.readLine());
            this.malla = new int[filas][columnas];
            String linea; 
            int i=0;
            while((linea=br.readLine())!=null){
                String[] l = linea.split(",");
                for(int e =0;e<l.length;e++){
                    malla[i][e] = Integer.valueOf(l[e]);
                }
                i++;
            }

        }catch(Exception e){
            e.getMessage();
        }
        
    }
    
    public Malla(int[][] malla){
        this.malla = malla;
    }

    @Override
    public String toString(){
        StringBuilder texto = new StringBuilder();
        for (int[] fila : malla){
            for (int j = 0; j<fila.length; j++)
                texto.append(fila[j]).append(" ");
            texto.append(System.getProperty("line.separator"));
        }
        return texto.toString();
    }
        
    public boolean izqVacio(Cuadrito a){
        if (a.getY()==0 )return false;
        return malla[a.getX()][a.getY()-1] <= 0;
    }
    public boolean derVacio(Cuadrito a){
        if (a.getY()==malla[0].length-1 )return false;
        return malla[a.getX()][a.getY()+1] <= 0;
    }
    public boolean arrVacio(Cuadrito a){
        if (a.getX()==0 )return false;
        return malla[a.getX()-1][a.getY()] <= 0;
    }
    public boolean abjVacio(Cuadrito a){
        if (a.getX()==malla.length-1 )return false;
        return malla[a.getX()+1][a.getY()] <= 0;
    }    

    public int[][] getMalla() {
        return malla;
    }

}
