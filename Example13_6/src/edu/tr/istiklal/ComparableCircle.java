package edu.tr.istiklal;

public class ComparableCircle extends Circle {

    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    /** GeometricObject sınıfından miras alınan compareTo metodunu ezme (override) */
    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}