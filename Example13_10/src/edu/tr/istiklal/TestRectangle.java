package edu.tr.istiklal;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.0, 5.0); // Alan = 20.0
        Rectangle r2 = new Rectangle(2.0, 10.0); // Alan = 20.0
        Rectangle r3 = new Rectangle(3.0, 5.0);  // Alan = 15.0

        // equals metodunu test etme (Alanları eşit mi?)
        System.out.println("r1 ve r2 eşit mi? (equals): " + r1.equals(r2));
        System.out.println("r1 ve r3 eşit mi? (equals): " + r1.equals(r3));

        // compareTo metodunu test etme
        System.out.println("r1 ve r2 karşılaştırması (compareTo): " + r1.compareTo(r2));
        System.out.println("r1 ve r3 karşılaştırması (compareTo): " + r3.compareTo(r1));
        System.out.println("r3 ve r1 karşılaştırması (compareTo): " + r3.compareTo(r1));
    }
}