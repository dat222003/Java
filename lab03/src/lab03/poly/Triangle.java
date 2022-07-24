/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.poly;

/**
 *
 * @author ADMIN
 */
public class Triangle extends Shape{
    private int base;
    private int height;
    
    Triangle(){
        super();
        this.base = 1;
        this.height = 1;
        
    }
    
    Triangle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }
    
    
    @Override
    public double getArea(){
        return this.base*this.height*1/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                super.toString() +
                '}';
    }
}
