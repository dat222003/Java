package lab03.src.lab03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher extends Person {

    private int numCourse;
    private String[] courses = {};

    Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if (isExistedIn(this.courses, course)){
            return false;
        }
        this.courses = add_to_array(courses, course);
        return true;
    }


    public boolean removeCourse(String course) {
        List<String> arrlist = new ArrayList<>(Arrays.asList(this.courses));
        if (arrlist.remove(course)) {
            this.courses = arrlist.toArray(this.courses);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.getName() + "(" + super.getAddress() + ')';
    }
}
