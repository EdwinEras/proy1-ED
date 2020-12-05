
package Clases;

import javafx.scene.control.Button;

public class Cuadrito extends Button{
    private int x;
    private int y;
    private int c;

    public Cuadrito (int x, int y, int c){
        this.setMinSize(80, 40);
        this.x = x;
        this.y = y;
        this.c = c;
        setColor(c);
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

    public int getC() {
        return c;
    }
    
    public void setColor(int num) {
        switch (num) {
            case 1:
                this.c = num;
                this.setStyle("-fx-background-color: #EC7063;-fx-border-color: black;");
                break;
            case 2:
                this.c = num;
                this.setStyle("-fx-background-color: #9B59B6;-fx-border-color: black;");
                break;
            case 3:
                this.c = num;
                this.setStyle("-fx-background-color: #5DADE2;-fx-border-color: black;");
                break;
            case 4:
                this.c = num;
                this.setStyle("-fx-background-color: #58D68D;-fx-border-color: black;");
                break;
            case 5:
                this.c = num;
                this.setStyle("-fx-background-color: #F4D03F;-fx-border-color: black;");
                break;
            default:
                this.c = num;
                this.setStyle("-fx-background-color: #FDFEFE;-fx-border-color: black;");
                break;
        }
        
    }
}
