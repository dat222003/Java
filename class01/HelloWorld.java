package class01;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HelloWorld {
//    introduce main method

    public static void main(String[] args) {
        byte b = 17;        //1 byte    Stores whole numbers from -128 to 127
        short sh = 32212;   //2 bytes	Stores whole numbers from -32,768 to 32,767
        int in = 5474;       //4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long l = 245;       //8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808
        float f = 32.3f;    //4 bytes	Stores fractional numbers from 3.4e−038 to 3.4e+038. Sufficient for storing 6 to 7 decimal digits
        double d = 53.12d;  //8 bytes	Stores fractional numbers from 1.7e−308 to 1.7e+038. Sufficient for storing 15 decimal digits
        boolean bool = true;//1 byte	Stores true or false values
        char ch = 'B';       //2 bytes	Stores a single character/letter
        String str = "Hello Java"; //double quotes vs. single quotes
        System.out.print(bool);
        System.out.print(d);
        System.out.println(str);
        System.out.println(ch);

        System.out.println("**************************");
        int x = 51, y = 23;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
//        System.out.println(x++); 
//        System.out.println(++x); 
//        System.out.println(x); 
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;

        System.out.println("**************************");
        String s1, s2;
        s1 = "Hello";
        s2 = "Java";
        System.out.println(s1 + s2);
        String s3 = s1 + "_" + s2;
        System.out.println(s3);
        int z = 15;
        System.out.println(z + s3);

        System.out.println("**************************");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myName = sc.nextLine(); //Wait for user input, naming convention
        System.out.println("Good morning " + myName);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your height in meter: ");
        double height = sc.nextDouble();
        //show other sc.next...()
        System.out.println("age: " + age + ", height: " + height);

        System.out.println("**************************");
        String rank;
        System.out.println("Enter your Math mark: ");
        double mathMark = sc.nextDouble();

        if (mathMark >= 9.0) { // == != > < >= <= && || !
            rank = "Excellent";
        } else if (mathMark >= 8.0) {
            rank = "Good";
        } else if (mathMark >= 6.5) {
            rank = "Well Done";
        } else if (mathMark >= 5.0) {
            rank = "Average";
        } else {
            rank = "Unsatisfied";
        }
        System.out.println(rank);

        System.out.println("Enter a number: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unknown!");
                break;
        }

        System.out.println("**************************");
        int n = 0;
        while (n < 5) {
            System.out.println(n);
            n++;
        }

        n = 0;
        do {
            System.out.println(n);
            n++;
        } while (n < 5);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("**************************");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        cars[1] = "Opel";
        System.out.println(cars[1]);
        System.out.println("#cars: " + cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String c : cars) {
            System.out.println(c);
        }

        int[][] myNumbers = {{1, 2, 3, 4}, {15, 16, 17}};
        int num = myNumbers[1][2];
        System.out.println(num);

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        System.out.println("**************************");
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.charAt(0));
        System.out.println(txt.charAt(15));
        
        txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        
        
//        Math
//        https://www.w3schools.com/java/java_math.asp
//
        

        System.out.println("**************************");
        double len = 12.2, wid = 5.3;
        double area = rectangleArea(len, wid);
        System.out.println(area);
//        System.out.println(rectangleArea(len, wid));
        
        checkPrimeNumber(10);
    }

    //exp: function, parameter, return type
    static double rectangleArea(double length, double width) {
        return length * width;
    }
    
    
    static void checkPrimeNumber(int n){
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                System.out.println(n + " is NOT a prime number");
                return;
            }
        }
        System.out.println(n + " is a PRIME number");
    }
}
