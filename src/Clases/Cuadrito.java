
package Clases;

import com.sun.prism.paint.Color;

public class Cuadrito {
    
    private int x;
    private int y;
    private Color c;

    public Cuadrito (int x, int y, Color c){
        this.x = x;
        this.y = y;
        this.c = Color.WHITE;
    }
    public int getX (){
        return this.x;
    }
    public int getY (){
        return this.y;
    }  
    public void setX (int x){
        this.x = x;
    }
    public void setY (int y){
        this.y = y;
    } 

    public Color getColor() {
        return c;
    }

    public void setColor(Color c) {
        this.c = c;
    }
    
    public boolean isWhite(){
        return this.c.equals(Color.WHITE);
    }
}
