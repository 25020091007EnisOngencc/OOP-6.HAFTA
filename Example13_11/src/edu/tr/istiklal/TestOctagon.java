package edu.tr.istiklal;

public class TestOctagon {
    public static void main(String[] args) {
        // Kenar uzunluğu 5 olan bir Octagon nesnesi oluşturma
        Octagon octagon1 = new Octagon(5.0);

        // Alan ve çevre bilgilerini ekrana yazdırma
        System.out.println("--- Orijinal Sekizgen (octagon1) ---");
        System.out.println("Alan: " + octagon1.getArea());
        System.out.println("Çevre: " + octagon1.getPerimeter());

        // clone metodunu kullanarak yeni bir nesne oluşturma
        Octagon octagon2 = (Octagon) octagon1.clone();

        // compareTo metodunu kullanarak iki nesneyi karşılaştırma
        System.out.println("\n--- Klonlanan Sekizgen (octagon2) ---");
        System.out.println("Alan: " + octagon2.getArea());

        System.out.println("\n--- Karşılaştırma Sonucu ---");
        int comparisonResult = octagon1.compareTo(octagon2);
        
        if (comparisonResult == 0) {
            System.out.println("octagon1 ve octagon2 birbirine eşittir (compareTo sonucu: 0).");
        } else if (comparisonResult > 0) {
            System.out.println("octagon1, octagon2'den büyüktür.");
        } else {
            System.out.println("octagon1, octagon2'den küçüktür.");
        }
    }
}