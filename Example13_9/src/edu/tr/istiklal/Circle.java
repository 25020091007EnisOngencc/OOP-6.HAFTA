package edu.tr.istiklal;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** GeometricObject'ten miras alınan compareTo metodunu ezme (override) */
    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    /** Yarıçapların eşitliğini kontrol eden equals metodu */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            return this.radius == ((Circle) o).radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Yarıçap: " + radius + ", Alan: " + getArea();
    }
}