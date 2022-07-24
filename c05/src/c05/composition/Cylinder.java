/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c05.composition;

/**
 *
 * @author ADMIN
 */
public class Cylinder {
    private Circle base;
    private double height;
    
    public Cylinder() {
        this(new Circle(), 1);
    }
    
    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
        
    }
    
    @Override
    public String toString() {
        return "Cylinder[" +
                "height=" + height +
                ", base=" + base + 
                ']';
    }
    
    
    
}
