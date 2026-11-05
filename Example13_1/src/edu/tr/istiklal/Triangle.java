package edu.tr.istiklal;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /** Varsayılan üçgen yapıc Methodist */
    public Triangle() {
    }

    /** Belirtilen kenar uzunluklarına sahip üçgen yapıcısı */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** side1 değerini döndürür */
    public double getSide1() {
        return side1;
    }

    /** side2 değerini döndürür */
    public double getSide2() {
        return side2;
    }

    /** side3 değerini döndürür */
    public double getSide3() {
        return side3;
    }

    /** Üçgenin alanını hesaplar (Heron Formülü) */
    @Override
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Üçgenin çevresini hesaplar */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** Üçgen sınıfının string temsilini döndürür */
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}