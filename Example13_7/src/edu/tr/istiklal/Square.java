package edu.tr.istiklal;

public class Square extends GeometricObject implements Colorable {
    private double side;

    /** Kenar uzunluğu 0 olan varsayılan yapıcı */
    public Square() {
        this.side = 0.0;
    }

    /** Belirtilen kenar uzunluğuna sahip yapıcı */
    public Square(double side) {
        this.side = side;
    }

    /** Kenar, renk ve doluluk durumu alan yapıcı */
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return super.toString() + "\nKare Kenarı: " + side + ", Alan: " + getArea();
    }
}