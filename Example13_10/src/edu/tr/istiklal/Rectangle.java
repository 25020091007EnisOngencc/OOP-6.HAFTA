package edu.tr.istiklal;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
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

    /** Alanlarının eşitliğini kontrol eden equals metodu */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            return this.getArea() == ((Rectangle) o).getArea();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Genişlik: " + width + ", Yükseklik: " + height + ", Alan: " + getArea();
    }
}