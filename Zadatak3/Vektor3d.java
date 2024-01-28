package Ispit.PrvaGrupa.Zadatak3;

public class Vektor3d {
    private double x;
    private double y;
    private double z;

    public Vektor3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "("+x+", "+y+", "+z+")";
    }
}
