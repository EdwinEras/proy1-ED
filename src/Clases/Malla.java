
package Clases;

import Vistas.VistaMalla;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class Malla {
    private static String file;
    private static int filas;
    private static int columnas;
    
    public Malla(){
        filas = 0;
        columnas = 0;
        file = "src/proyectoestructuras/Cuadro.txt";
        
    }
    
    public static boolean isVacio(Cuadrito a){
        int colorC = VistaMalla.getCuadrito(a.getX(), a.getY()).getC();
        return colorC <= 0;
    }
        
    public static boolean izqVacio(Cuadrito a){
    if (a.getY() == 0 )return false;
        int colorC = VistaMalla.getCuadrito(a.getX(), a.getY()-1).getC();
        return colorC <= 0;
    }
    
    public static boolean derVacio(Cuadrito a){
        if (a.getY() == columnas-1 )return false;
        int colorC = VistaMalla.getCuadrito(a.getX(), a.getY()+1).getC();
        return colorC <= 0;
    }
    
    public static boolean arrVacio(Cuadrito a){
        if (a.getX() == 0 )return false;
        int colorC = VistaMalla.getCuadrito(a.getX()-1, a.getY()).getC();
        return colorC <= 0;
    }
    
    public static boolean abjVacio(Cuadrito a){
        if (a.getX() == filas-1 )return false;
        int colorC = VistaMalla.getCuadrito(a.getX()+1, a.getY()).getC();
        return colorC <= 0;
    }

    public static void crearMalla() throws IOException, ClassNotFoundException{ 
        try(BufferedReader bf = new BufferedReader(new FileReader(file))){
            String linea;
            filas = Integer.valueOf(bf.readLine());
            columnas = Integer.valueOf(bf.readLine());
            int i = 0;
            while((linea=bf.readLine()) != null){
                System.out.println(linea);
                String[] p = linea.split(",");
                for(int j=0; j<p.length; j++){
                    int color = Integer.parseInt(p[j]);
                    VistaMalla.addCuadrito(new Cuadrito(i, j, color));
                }
                i++;
            }
            System.out.println("Se leen Cuadros");
            
        }catch(IOException e){
            throw e;
        }
    }
}
