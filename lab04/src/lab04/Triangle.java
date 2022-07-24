package lab04.src.lab04;

public class Triangle extends Shape {

    private final int base;
    private final int height;


    public Triangle() {
        super();
        this.base = 1;
        this.height = 1;
    }

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.base * this.height * 1/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
