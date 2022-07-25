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
        int result = 0;
        try {
            result = getLeft() - getRight();
        } catch (ArithmeticException math) {
            System.out.println(this + " = Error -> " + math);
        }
        return result;
    }
}
