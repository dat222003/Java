/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c05.composition;

/**
 *
 * @author ADMIN
 */
public class Circle {
    private final double radius;
    private final String color;
    
    public Circle(){
        this(1,"red");
    }
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
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
                ", color=" + color +
                ']';
    }
    
}
