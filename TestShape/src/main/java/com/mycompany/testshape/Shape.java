package com.mycompany.testshape;

/**
 * @author Yumi Febriana
 */
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        color = "green";
        filled = true;
    }
    
    public Shape (String c, boolean f){
        color = c;
        filled = f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString(){
        if(isFilled()){
            return " A shape with color of " + color + " is filled";
        }else{
            return " A shape with color of " + color + " Isn't filled";
        }    
    }   
}
