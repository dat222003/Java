/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Temperature temp = new Temperature(0);
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter Fahrenheit value: ");
            double input = Double.parseDouble(sc.nextLine());
            if (input == 0) return;
            temp.setFarenheit(input);
            System.out.println("F= " + temp.getFarenheit() + "; C = " + temp.getCelcius() + "; K = " + temp.getKelvin());
        }while (true);
    }
    
}
