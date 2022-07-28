package lab06;

public class Modular extends Division {
    public Modular() {
    }

    public Modular(String line) {
        super(line);
    }

    @Override
    int calculate() {
        return getLeft() % getRight();
    }
}
