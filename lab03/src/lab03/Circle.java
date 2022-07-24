package lab03;

public class Circle extends Shape{
    private final double radius;

    Circle(){
        super();
        this.radius = 1.0;
    }

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return 2 * Math.PI * this.radius;
    }

    public double getPerimeter() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return   "A Circle with radius= "+ String.format("%.2f", this.radius)  +", which is a subclass of " + super.toString();
    }
}
