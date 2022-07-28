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
        return getLeft() + getRight();
    }
}
