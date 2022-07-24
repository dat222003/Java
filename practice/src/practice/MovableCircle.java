package practice;

public class MovableCircle implements Movable {

    private final int radius;
    private final MovablePoint center;

    public MovableCircle() {
        this.center = new MovablePoint();
        this.radius = 1;
    }

    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }


    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
