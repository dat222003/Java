package lab06;

public class Division extends MathExpression {
    public Division() {
    }

    public Division(String line) {
        super(line);
    }

    @Override
    public String toString() {
        if (getRight() == 0 ) {
            return "MathExpression: " +
                left + " " + operator + " " + right + " = " + "divisor cannot be zero"; 
        }
        
        return super.toString();
        
        
    }

    @Override
    int calculate() {
        return getLeft() / getRight();
    }

}
