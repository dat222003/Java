package lab06;

public class Division extends MathExpression {
    public Division() {
    }

    public Division(String line) {
        super(line);
    }

    @Override
    public String toString() {
        if( getLeft() == 0 || getRight() ==0 )
            return "MathExpression: " +
                    left + " " + operator + " " + right + " = " + "divisor cannot be zero";
        return super.toString();
    }

    @Override
    int calculate() {
        int result = 0;
        try {
//            if(getRight() != 0 && getLeft() != 0)
                result = getLeft() / getRight();
        } catch (ArithmeticException math) {
            System.out.println(this + " = Error -> " + math);
        }
        return result;
    }

}
