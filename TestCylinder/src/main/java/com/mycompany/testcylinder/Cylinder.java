package com.mycompany.testcylinder;

/**
 *
 * @author Yumi Febriana
 */
public class Cylinder extends Circle{
    private double height;
    
    //Constructor with default color,radius,and height
    
    public Cylinder(){
        super();
        height = 1.0;
    }
    
    //Constructor with default radius, color but given height
    public Cylinder (double height){
        super();
        this.height = height;
    }
    
    //Construcyor with default color, but given radius , height
    public Cylinder(double radius, double height){
        super(radius); // call superclass constructer circle (r)
        this.height = height;
    }
    
    //A public ethod for retrieving the height
    public double getHeight(){
        return height;
    }
    
    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume(){
        return super.getArea()*height;      //menambah super
    }
    
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*getHeight()+2 *super.getArea();
    }   
    
    @Override
    public String toString(){
        return "Cylinder : subclass of  " + super.toString() + " height " + height;
    }
}