/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author ADMIN
 */
public class Lab03_03 {
    public static void main(String[] args) {
        //Bai3
//        System.out.println("*****************");
//        System.out.println("Circle");
//        Circle c = new Circle("red", true, 1.0);
//        System.out.println("Circle.getArea: " + c.getArea());
//        System.out.println("Circle.getPerimeter: " + c.getPerimeter());
//        System.out.println(c);
//        System.out.println("*****************");
//        System.out.println("Rectangle");
//        Rectangle r = new Rectangle("green", true, 3.0, 2.0);
//        System.out.println("Rectangle.getArea: " + r.getArea());
//        System.out.println("Rectangle.getPerimeter: " + r.getPerimeter());
//        System.out.println(r);
        System.out.println("*****************");
        System.out.println("Square");
//        Square s1 = new Square();
//        System.out.println(s1);
        Square s = new Square("green", false, 3.0);
        System.out.println("Square.getArea: " + s.getArea());
        System.out.println("Square.getPerimeter: " + s.getPerimeter());
        System.out.println(s);
        Square ss = new Square("green", false, 3.0);
        ss.setLength(2);
        System.out.println("NewSquare.getArea: " + ss.getArea());
        System.out.println("NewSquare.getPerimeter: " + ss.getPerimeter());
        System.out.println("Side: "+ss.getSide());
        System.out.println(ss);
    }
    
}
