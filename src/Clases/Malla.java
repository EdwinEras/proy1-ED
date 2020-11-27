
package Clases;

public class Malla {
    private int[][] malla;
    
    public Malla(){
        this.malla = new int[][]{
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 2, 2, 0, 0},
        {0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 2, 2, 0, 0},
        {0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 2, 0, 0},
        {0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 2, 0, 0},
        {0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 2, 0, 0},
        {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2},
        {0, 0, 0, 3, 0, 0, 1, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2},
        {3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2},
        {0, 0, 3, 3, 3, 3, 3, 3, 0, 0, 2, 2, 2, 2, 2, 2, 2},
        {0, 0, 3, 3, 3, 3, 3, 3, 0, 0, 2, 2, 2, 2, 2, 2, 2},
        {0, 0, 3, 3, 3, 3, 3, 3, 0, 0, 2, 2, 2, 2, 2, 2, 2},
        {0, 0, 3, 3, 3, 3, 3, 3, 0, 0, 2, 2, 2, 2, 2, 2, 2},
        {0, 0, 3, 3, 3, 3, 3, 3, 0, 0, 2, 2, 2, 2, 2, 2, 2},
        {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},        
        {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}};
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
