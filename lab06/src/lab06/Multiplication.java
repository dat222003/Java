package lab06;

public class Multiplication extends MathExpression {

    public Multiplication() {
    }

    public Multiplication(String line) {
        super(line);
    }

    @Override
    int calculate() {
        return getLeft() * getRight();
    }
}
