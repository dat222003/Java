/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab06;

import java.io.*;

/**
 *
 * @author ADMIN
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MathExpression[] me = new MathExpression[150];
        try (
             BufferedReader reader = new BufferedReader(new FileReader("src/lab06/math.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("math_oop_result.txt"));
        ) {
            String line;
            int i = 0;
            while((line = reader.readLine()) != null) {
                String[] lineparts = line.split(" ");
                String op = lineparts[1];
                try {
                    int a = Integer.parseInt(lineparts[0]);
                    int b = Integer.parseInt(lineparts[2]);
                    switch (op) {
                        case "+" -> me[i] = new Addition(line);
                        case "-" -> me[i] = new Subtraction(line);
                        case "*" -> me[i] = new Multiplication(line);
                        case "/" -> me[i] = new Division(line);
                        case "%" -> me[i] = new Modular(line);
                        default -> me[i] = new MathExpression(line) {
                            @Override
                            int calculate() {
                                return 0;
                            }
                            @Override
                            public String toString() {
                                return "MathExpression: " +
                                        left + " "
                                        + operator + " "
                                        + right + " = Error -> "
                                        + operator + " is not an operator";
                            }
                        };
                    }
                } catch (NumberFormatException num) {
                    String equay = line;
                    me[i] = new MathExpression(equay) {
                        @Override
                        int calculate() {
                            return 0;
                        }
                        @Override
                        public String toString() {
                            return "MathExpression: " +
                                    equay + " = Error -> " + num;
                        }
                    };
                }
            System.out.println(me[i]);
            writer.write(me[i] + "\n");
            i++;

            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    
}
