/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c05;

/**
 *
 * @author ADMIN
 */
public class Cylinder extends Circle{
    private final double height;
    
    public Cylinder(){
        this(1,1);
    }
    
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    
    public double getVolume(){
        double result = Math.PI * Math.pow(getRadius(), 2)*getHeight();
        return Double.parseDouble(String.format("%.2f", result));
        
    }
    
    @Override
    public double getArea(){
        double result = (2*Math.PI*getRadius()*getHeight()) + 2*Math.PI*Math.pow(getRadius(), 2);
        return Double.parseDouble(String.format("%.2f", result));
    }


    @Override
    public String toString() {
        return "Cylinder[" +
                "height=" + height +
                ']';
    }
}
