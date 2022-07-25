package lab06;

public class Modular extends MathExpression {
    public Modular() {
    }

    public Modular(String line) {
        super(line);
    }

    @Override
    int calculate() {
        int result = 0;
        try {
            result = getLeft() % getRight();
        } catch (ArithmeticException math) {
            System.out.println(this + " = Error -> " + math);
        }
        return result;
    }
}
