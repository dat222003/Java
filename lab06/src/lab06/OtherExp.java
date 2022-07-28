/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author ADMIN
 */
public class OtherExp extends MathExpression{
    String line;
    
    OtherExp(String line) {
        this.line = line;
    }
    
    @Override
    int calculate() {
        return 0;
    }
    
    
    @Override
    public String toString() {
        return "MathExpression: " +
                this.line + " = " + "invalid expression";
    }
}
