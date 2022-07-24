/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.poly;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);  // Upcast
        System.out.println(s1);  // Run Rectangle's toString()
        System.out.println("Area is " + s1.getArea());  // Run Rectangle's getArea()

        Shape s2 = new Triangle("blue", 4, 5);  // Upcast
        System.out.println(s2);  // Run Triangle's toString()
        System.out.println("Area is " + s2.getArea());  // Run Triangle's getArea()

        Cylinder s3 = new Cylinder(2d, 5d);
        System.out.println(s3);
        System.out.println("Height "+ s3.getHeight());
        System.out.println("Area is " + s3.getArea());
        System.out.println("Volume is "+ s3.getVolume());
    }

}
