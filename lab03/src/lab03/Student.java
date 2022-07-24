package lab03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends Person {

    private int numCourse;
    private String[] courses = {};
    private Integer[] grades= {};

    Student() {
        super();

    }

    Student(String name, String address) {
        super(name, address);

    }

    public void addCourseGrade(String course, int grade) {
        this.courses =  super.add_to_array(courses, course);
        this.grades =  super.add_to_array(grades, grade);
    }

    public void printGrades() {
        System.out.println(Arrays.toString(this.grades));
    }

    public double getAverageGrade() {
        double avg = 0;
        for (int g: this.grades) {
            avg += g;
        }
        avg = avg/grades.length;
        return  avg;
    }

    @Override
    public String toString() {
        return "Student: " + super.getName() + "(" + this.getAddress() + ")";
    }
}

