/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab03.src.lab03;

/**
 * @author ADMIN
 */
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Bai1
        /* Test Point2D */
        // Test constructors and toString()
//        Point2D p2a = new Point2D(1, 2);
//        System.out.println(p2a);  // toString()
//        Point2D p2b = new Point2D();  // default constructor
//        System.out.println(p2b);
//        // Test Setters and Getters
//        p2a.setX(3);  // Test setters
//        p2a.setY(4);
//        System.out.println(p2a);  // toString()
//        System.out.println("x is: " + p2a.getX());
//        System.out.println("y is: " + p2a.getY());
//
//        /* Test Point3D */
//        // Test constructors and toString()
//        Point3D p3a = new Point3D(11, 12, 13);
//        System.out.println(p3a);  // toString()
//        Point2D p3b = new Point3D();  // default constructor
//        System.out.println(p3b);
//        // Test Setters and Getters
//        p3a.setX(21);  // in superclass
//        p3a.setY(22);  // in superclass
//        p3a.setZ(23);  // in this class
//        System.out.println(p3a);  // toString()
//        System.out.println("x is: " + p3a.getX());  // in superclass
//        System.out.println("y is: " + p3a.getY());  // in superclass
//        System.out.println("z is: " + p3a.getZ());  // in this class

        //Bai2
        Student s1 = new Student("Tan Ah Teck", "1 Happy Ave");
        s1.addCourseGrade("IM101", 97);
        s1.addCourseGrade("IM102", 68);
        s1.printGrades();
        System.out.println(s1);
        System.out.println("Average is " + s1.getAverageGrade());
        /* Test Teacher class */
        Teacher t1 = new Teacher("Paul Tan", "8 sunset way");
        System.out.println(t1);
        String[] courses = {"IM101", "IM102", "IM101"};
        for (String course: courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " added.");
            } else {
                System.out.println(course + " cannot be added.");
            }
        }
        for (String course: courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed.");
            } else {
                System.out.println(course + " cannot be removed.");
            }
        }



        //Bai3
//        System.out.println("*****************");
//        System.out.println("Circle");
//        Circle c = new Circle("red", true, 1.0);
//        System.out.println("Circle.getArea: " + c.getArea());
//        System.out.println("Circle.getPerimeter: " + c.getPerimeter());
//        System.out.println(c);
//        System.out.println("*****************");
//        System.out.println("Rectangle");
//        Rectangle r = new Rectangle("green", true, 3.0, 2.0);
//        System.out.println("Rectangle.getArea: " + r.getArea());
//        System.out.println("Rectangle.getPerimeter: " + r.getPerimeter());
//        System.out.println(r);
//        System.out.println("*****************");
//        System.out.println("Square");
//        Square s = new Square("green", false, 3.0);
//        System.out.println("Square.getArea: " + s.getArea());
//        System.out.println("Square.getPerimeter: " + s.getPerimeter());
//        System.out.println(s);



    }

}
