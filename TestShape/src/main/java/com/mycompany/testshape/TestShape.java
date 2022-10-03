package com.mycompany.testshape;

/**
 * @author Yumi Febriana
 */
public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        
        Shape s2 = new Shape("white", false);
        System.out.println(s2.toString());
        
        Circle c1 = new Circle();
        System.out.print(c1.toString());
        System.out.println(" Luas = " + c1.getArea());
        
        Circle c2 = new Circle(7.0);
        System.out.print(c2.toString());
        System.out.println( " has Luas = " + c2.getArea());
        
        Circle c3 = new Circle(7.0 , "Blue" , true);
        System.out.println(c3.toString());
        
        Rectangle r1 = new Rectangle();
        System.out.print(r1.toString());
        System.out.println (" has Luas = " + r1.getArea() + " ,Keliling = " + r1.getPerimeter());
        
        Rectangle r2 = new Rectangle (10.0, 5.0);
        System.out.print(r2.toString());
        System.out.println (" has Luas = " + r2.getArea() + " ,Keliling = " + r2.getPerimeter());
        
        Rectangle r3 = new Rectangle(10.0 , 5.0, "Pink", true);
        System.out.print(r3.toString());
        System.out.println (" has Luas = " + r3.getArea() + " ,Keliling = " + r3.getPerimeter());
        
        Square sq1 = new Square();
        System.out.print(sq1.toString());
        System.out.println (" has Luas = " + sq1.getArea() + " ,Keliling = " + sq1.getPerimeter());
    }
}
