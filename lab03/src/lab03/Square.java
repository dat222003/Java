package lab03.src.lab03;

public class Square extends Rectangle {
    Square(){
        super();
    }

    Square(String color, boolean filled, Double side) {
        super(color, filled, side, side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side= "+ this.getLength() +", which is a subclass of " + super.toString();
    }
}
