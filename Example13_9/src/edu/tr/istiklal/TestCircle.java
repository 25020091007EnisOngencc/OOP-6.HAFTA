package edu.tr.istiklal;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(7.5);

        // equals metodunu test etme
        System.out.println("circle1 ve circle2 eşit mi? (equals): " + circle1.equals(circle2));
        System.out.println("circle1 ve circle3 eşit mi? (equals): " + circle1.equals(circle3));

        // compareTo metodunu test etme
        System.out.println("circle1 ve circle2 karşılaştırması (compareTo): " + circle1.compareTo(circle2));
        System.out.println("circle1 ve circle3 karşılaştırması (compareTo): " + circle1.compareTo(circle3));
        System.out.println("circle3 ve circle1 karşılaştırması (compareTo): " + circle3.compareTo(circle1));
    }
}