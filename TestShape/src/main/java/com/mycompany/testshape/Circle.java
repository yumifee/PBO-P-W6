package com.mycompany.testshape;

/**
 * @author Yumi Febriana
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(){
        radius = 1.0;
    }
    
    public Circle (double r){
        this.radius = r;
    }
    
    public Circle (double r, String c, boolean f){
        this.radius = r;
        super.setColor(c);
        super.setFilled(f);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI*radius;
    }
    
    @Override
    public String toString(){
        return " A Circle with radius = " + radius + ", which is a subclass of" + super.toString();
    } 
}
