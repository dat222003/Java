package lab04.src.lab04;

public abstract class Shape {

    private String color;

    Shape(){
        color = "red";
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }


}
