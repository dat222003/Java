/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author dat222003
 */
public class java01{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input;
      String out;
      do {
          lab1();
          System.out.print("Continue ? (Y): ");
          input = sc.nextLine();
          out = input.toUpperCase();
      } while (out.contains("Y"));
  }

    public static void lab1() {
        boolean continued = false;
        try {
            do {
                continued = false;
                String key = getinput("Select (): ");
                switch (key) {
                    case "name" -> printname();
                    case "5.12" -> InputValidation();
                    case "5.13" -> AverageWithInputValidation();
                    case "6.2" -> CheckerPattern();
                    case "8.3" -> PhoneKeyPad();
                    case "8.4" -> Caesar();
                    case "9.2" -> PrintArrayInStars();
                    case "end" -> System.exit(0);
                    default -> {
                        System.out.println("Invalid input... Try again ");
                        continued = true;
                    }
                }
            } while (continued);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
  public static Integer[] add_to_array(Integer[] arr, int x)
  {

      List<Integer> arrlist = new ArrayList<>(Arrays.asList(arr));
      arrlist.add(x);
      arr = arrlist.toArray(arr);

      return arr;
  }

  static boolean check_positive_int(String input) 
  {
    try {
      int number = Integer.parseInt(input);
      if (number < 0 ) {
        System.out.println("Invalid input negative integer");
        return false;
      }
    } catch (Exception e) {
      System.out.println("Invalid input integer only ");
      return false;
    }
    return true;
  }

  static String getinput(String label) 
  {

    Scanner sc = new Scanner(System.in);
    System.out.print(label);
    return sc.nextLine();

  }

  static void printname() 
  {

    String myName = getinput("Enter name: ");
    System.out.println("Your Name: " + myName);

  }

  static void InputValidation() 
  {

    int num;
    do {
      String input = getinput("Enter a number between 0-10 or 90-100: ");
      try {
        num = Integer.parseInt(input);
        if (num < 0 || num > 100 || (num > 10 && num < 90)) {
          System.out.println("Invalid input, try again...");
        }
      } catch (Exception e) {
        System.out.println("Input must be an integer.");
        num =-1;
      }
    } while (num < 0 || num > 100 || (num > 10 && num < 90));
    System.out.println("You have entered: "+num);


  }

  static void AverageWithInputValidation() 
  {
    int n = 1;
    Double total = 0.0;
    do {
      
      String Label = "Enter the mark (0-100) for student " + n + ": ";
      String input = getinput(Label);
      try {
        Double num = Double.parseDouble(input);
        if (num > 100 || num < 0) {
          System.out.println("Invalid input, try again...");
        }else{
          total += num;
          n++;
        }
      } catch (Exception e) {
        System.out.println("Input must be Decimal or Integer. ");
      }
      
    } while (n<4);
    Double average = total/3;
    System.out.println("The average is: "+ String.format("%.2f", average));

  }

  static void CheckerPattern() 
  {

    
    int size;
    int i = 1;
    do {
      String input = getinput("Enter size(INT): ");
      try {
        size = Integer.parseInt(input);
        if (size < 1 || size >100) {
          System.out.println("Invalid input, try again...");
          continue;
        }
        for (i = 1;i <= size;i++) {
          for (int j = 1; j <= size; j++) {
            System.out.print("# ");
          }
          System.out.println();
          if (i % 2 == 1) {
            System.out.print(" ");
          }
        }

      } catch (Exception e) {
        System.out.println("Input must be an integer.");
      }
    } while (i == 1);
  }

  static void PhoneKeyPad() 
  {

    StringBuilder keypad = new StringBuilder();
    int i = 0;
    do {
    String input = getinput("Enter your text: ");
    input = input.toUpperCase();
      for (i = 0; i < input.length(); i++) {
          switch (input.charAt(i)) {
              case 'A', 'B', 'C' -> keypad.append('2');
              case 'D', 'E', 'F' -> keypad.append('3');
              case 'G', 'H', 'I' -> keypad.append('4');
              case 'J', 'K', 'L' -> keypad.append('5');
              case 'M', 'N', 'O' -> keypad.append('6');
              case 'P', 'Q', 'R', 'S' -> keypad.append('7');
              case 'T', 'U', 'V' -> keypad.append('8');
              case 'W', 'X', 'Y', 'Z' -> keypad.append('9');
              default -> {
                  System.out.println("Invalid input... Try again");
                  keypad = new StringBuilder();
                  i = input.length();
              }
          }
      }
    } while (keypad.toString() == "");
    System.out.print("keypad: "+ keypad);
  }

  static void Caesar()
  {

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";// 26
    int num = 3;
    String result = "";
    boolean continued = false;
    int pos_out = 0;
    int alphabet_length = 26;
    int breakpoint = alphabet_length - num;
    do {
      String input = getinput("Enter a plaintext string: ");
      input = input.toUpperCase();

      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        int pos_in = alphabet.indexOf(c);
        if (pos_in < 0) {
          continued = true;
          System.out.println("Invalid input... Try again ");
          result = "";
          break;
        }
        continued = false;

        if ( pos_in < breakpoint ) {
            pos_out = pos_in + num;
            result += alphabet.charAt(pos_out);
        } else if (pos_in == breakpoint) {
            pos_out = 0;
            result += alphabet.charAt(pos_out);
        }else{
            pos_out = pos_in - breakpoint;
            result += alphabet.charAt(pos_out);
        }
        
      }
    } while (continued);

    System.out.println(result);

  }

  static String drawstar(int x) 
  {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < x; i++) {
      result.append("*");
    }
    return result.toString();
  }

  static void PrintArrayInStars() 
  {

    int i;
    String num_of_items;
    int count = 1;
    Integer[] input = {};
    // process input
    do {
      num_of_items = getinput("Enter the number of items: ");
      if (check_positive_int(num_of_items)) {
        int num = Integer.parseInt(num_of_items);
        do {
          String raw = getinput("Enter the value of all items "+ count + ": ");
          if (check_positive_int(raw)) {
            int item = Integer.parseInt(raw);
            input = add_to_array(input, item);
            count++;
          }
        }while ( count <= num);
      }
    } while (!check_positive_int(num_of_items));
    //end input

    //print
    for (i = 0,count = 0; i < input.length; i++) {
      System.out.println( count++ + ": " + drawstar(input[i]) + "(" +input[i] + ")" );
    }

  }


  
}
