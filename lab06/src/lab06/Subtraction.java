package lab06;

public class Subtraction extends MathExpression {

    Subtraction() {
        super();
    }

    Subtraction(String line) {
        super(line);
    }

    @Override
    int calculate() {
        return getLeft() - getRight();
    }
}
