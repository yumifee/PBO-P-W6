package com.mycompany.testcylinder;

/**
 *
 * @author Yumi Febriana
 */
public class Circle {
    private double radius;
    private String color;
    
    //constructor (Overloaded)
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r){
        radius = r;
        color = "red";
    }
    
    public Circle(double r, String color){
        radius = r;
        this.color = color;
    }
    
    /** Returns the radius */
    public double getRadius(){
        return radius;
    }
    
     /** Returns the area of this Circle instance */
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    /** Return a self-descriptive string of this instance in the form of
    Circle[radius=?,color=?] */
     public String toString() {
     return "Circle[radius=" + radius + " color=" + color + "]";
     }
     
     public String getColor(){
         return color;
     }
     
     public void setColor (String color){
         this.color = color;
     }
}

