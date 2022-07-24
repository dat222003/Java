package lab04.src.lab04;

public class Test02 {
    public static void main(String[] args) {
        Movable p;
        p = new MovablePoint();
        System.out.println(p);
        p.moveDown();
        System.out.println(p);
        p.moveLeft();
        System.out.println(p);
        p.moveRight();
        System.out.println(p);
        p.moveUp();
        System.out.println(p);

    }
}
