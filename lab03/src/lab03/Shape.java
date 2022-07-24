package lab03;
public class Shape {

    private String color;
    private boolean filled;

    Shape(){
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        String result =  "A Shape with color of "+ this.color + " and " ;
        if (this.filled){
            result += "filled ";
            return result;
        }
        result += "not filled ";
        return result;
    }
}
