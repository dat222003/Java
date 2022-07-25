package lab06;

public class Multiplication extends MathExpression {

    public Multiplication() {
    }

    public Multiplication(String line) {
        super(line);
    }

    @Override
    int calculate() {
        int result = 0;
        try {
            result = getLeft() * getRight();
        } catch (ArithmeticException math) {
            System.out.println( " = Error -> " + math);
        }
        return result;
    }
}
