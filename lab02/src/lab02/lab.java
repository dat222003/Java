/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.src.lab02;

/**
 *
 * @author ADMIN
 */
public class lab {

    public static void main(String[] args) {
        //Circle
        circle circle = new circle();
        System.out.println("Circle");
        circle.setRadius(3);
        System.out.println("getRadius: " + String.format("%.2f", circle.getRadius()) );
        System.out.println("toString: " + circle);
        System.out.println("getArea: " + String.format("%.2f", circle.getArea()) );
        System.out.println("getCircumference: " + String.format("%.2f", circle.getCircumference()) );
        System.out.println("************");
        //Employee
        System.out.println("Employee");
        Employee employee = new Employee(1, "le", "dat", 500);
        System.out.println("toString: " + employee);
        System.out.println("getId: " + employee.getId());
        System.out.println("getFirstname " + employee.getFirstname());
        System.out.println("getLastname " + employee.getLastname());
        System.out.println("getName " + employee.getName());
        System.out.println("getSalary " + employee.getSalary());
        System.out.println("setSalary: = 10000");
        employee.setSalary(10000);
        System.out.println("new Salary: " + employee.getSalary());
        System.out.println("getAnnuallySalary: " + employee.getAnnuallySalary());
        System.out.print("raiseSalary to 20%: " + employee.raiseSalary(20));
        System.out.println("toString: " + employee);
    }
    
}
