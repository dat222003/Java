/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.poly;

/**
 *
 * @author ADMIN
 */
public class Rectangle extends Shape{
    private final int length;
    private final int width;
    
    Rectangle() {
        super();
        this.length = 1;
        this.width = 1;
    }
    
    Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea(){
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                super.toString() +
                '}';
    }
}
