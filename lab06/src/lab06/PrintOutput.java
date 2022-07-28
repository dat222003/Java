package lab06;

import java.io.*;

public class PrintOutput {

    public static void main(String[] args) {
        try (
                 BufferedReader reader = new BufferedReader(new FileReader("src/lab06/math.txt"));
                 BufferedWriter writer = new BufferedWriter(new FileWriter("math_result.txt"));
            ) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] lineparts = line.split(" ");
                int a = 1;
                int b = 1;
                try {
                    a = Integer.parseInt(lineparts[0]);
                    b = Integer.parseInt(lineparts[2]);
                } catch (NumberFormatException num) {
                    lineparts = line.split(" ");
                    writer.write(line + " = Error -> " + num + "\n");
                }
                String op = lineparts[1];
                try {
                    switch (op) {
                        case "+" -> writer.write(line + " = " + (a + b) + "\n");
                        case "-" -> writer.write(line + " = " + (a - b) + "\n");
                        case "*" -> writer.write(line + " = " + (a * b) + "\n");
                        case "/" -> writer.write(line + " = " + (a / b) + "\n");
                        case "%" -> writer.write(line + " = " + (a % b) + "\n");
                        default -> writer.write(a + " " + op + " " + b + " not an operator" + "\n");
                    }
                } catch (ArithmeticException math) {
                    writer.write(a + " " + op + " " + b + " = Error -> " + math + "\n");
                }

            }

        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception exp) {
            System.out.println(exp);
        } finally {
            System.out.println("completed");
        }
        
    }
}
