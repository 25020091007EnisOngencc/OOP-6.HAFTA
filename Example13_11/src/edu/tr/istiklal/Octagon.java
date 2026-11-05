package edu.tr.istiklal;

public class Octagon extends GeometricObject implements Cloneable {
    private double side;

    /** Varsayılan yapıcı metot (kenar = 0) */
    public Octagon() {
        this.side = 0.0;
    }

    /** Belirtilen kenar uzunluğuna sahip yapıcı metot */
    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    /** Sekizgenin alanını hesaplama: (2 + 4 / sqrt(2)) * side * side */
    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    /** Sekizgenin çevresini hesaplama: 8 * side */
    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    /** GeometricObject sınıfından miras alınan compareTo metodunu ezme */
    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    /** Cloneable arayüzünden gelen nesne klonlama metodu */
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Sekizgen Kenarı: " + side + ", Alan: " + getArea() + ", Çevre: " + getPerimeter();
    }
}