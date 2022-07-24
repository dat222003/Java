/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.poly;

/**
 *
 * @author ADMIN
 */
public class Circle {
    
    private double radius;
    
    Circle(){
        this.radius = 1d;
    }
    
    Circle(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }


    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
