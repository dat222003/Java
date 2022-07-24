/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.poly;

/**
 * @author ADMIN
 */
public class Shape {
    
    private String color;
    
    
    Shape(){
        this.color = "default";
    }
    
    Shape(String color){
        this.color = color;
    }
    
    public double getArea(){
        return 0d;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
