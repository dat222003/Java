package lab03.src.lab03;

public class Point3D extends Point2D{
    private int z;

    Point3D(){
        super();
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
