package lab06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab01 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/lab06/math.txt"))) {
            String line;

            while((line = reader.readLine()) != null) {
                String[] lineparts = line.split(" ");
                int a = 1; int b = 1;
                try {
                    a = Integer.parseInt(lineparts[0]);
                    b = Integer.parseInt(lineparts[2]);
                } catch (NumberFormatException num){
                    lineparts = line.split(" ");
                    System.out.println(line + "= Error -> " + num);
                }
                String op = lineparts[1];
                try {
                    switch (op) {
                        case "+" -> System.out.println(line + " = " + (a + b));
                        case "-" -> System.out.println(line + " = " + (a - b));
                        case "*" -> System.out.println(line + " = " + (a * b));
                        case "/" -> System.out.println(line + " = " + (a / b));
                        case "%" -> System.out.println(line + " = " + (a % b));
                        default -> System.out.println(a + " " + op + " " + b + " not an operator");
                    }

                } catch (ArithmeticException math) {
                    System.out.print(a + " " + op + " " + b + " = Error -> ");
                    System.out.println(math);
                }

            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
