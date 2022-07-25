package lab06;

public class Addition extends MathExpression {

    Addition(){
        super();
    }

    Addition(String line) {
        super(line);
    }
    @Override
    public int calculate() {
        int result = 0;
        try {
            result = getLeft() + getRight();
        } catch (ArithmeticException math) {
            System.out.println(this + " = Error -> " + math);
        }
        return result;
    }
}
