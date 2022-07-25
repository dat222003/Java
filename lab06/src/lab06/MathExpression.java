package lab06;

import java.io.*;

public abstract class MathExpression {
    abstract int calculate();
    int left;
    int right;
    String operator;

    public MathExpression(){
        this.left = 1;
        this.right = 1;
        this.operator = "?";
    }

    public MathExpression(String line) {
        String[] lineparts = line.split(" ");
        int a;
        int b;
        try {
            a = Integer.parseInt(lineparts[0]);
            b = Integer.parseInt(lineparts[2]);
            String op = lineparts[1];
            this.left = a;
            this.right = b;
            this.operator = op;
        } catch (NumberFormatException num) {
//            System.out.println(line + " = Error -> " + num);
        }
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
//        if  (getLeft() == 0 && getRight() == 0)
//            return null;
        return "MathExpression: " +
                left + " " + operator + " " + right + " = " + calculate();
    }
}
