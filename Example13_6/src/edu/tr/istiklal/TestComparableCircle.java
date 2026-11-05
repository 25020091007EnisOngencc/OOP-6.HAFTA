package edu.tr.istiklal;

public class TestComparableCircle {
    public static void main(String[] args) {
        // İki adet ComparableCircle nesnesi oluşturma
        ComparableCircle circle1 = new ComparableCircle(5.5);
        ComparableCircle circle2 = new ComparableCircle(4.2);

        // İki ComparableCircle nesnesinden büyük olanını bulma
        System.out.println("--- İki ComparableCircle Karşılaştırması ---");
        System.out.println("1. Daire: " + circle1);
        System.out.println("2. Daire: " + circle2);
        
        ComparableCircle largerCircle = (circle1.compareTo(circle2) >= 0) ? circle1 : circle2;
        System.out.println("Daha büyük olan dairenin alanı: " + largerCircle.getArea() + "\n");

        // Bir daire (ComparableCircle) ile bir dikdörtgenin alan karşılaştırması
        ComparableCircle c = new ComparableCircle(6.0);
        Rectangle r = new Rectangle(5.0, 8.0);

        System.out.println("--- Daire ve Dikdörtgen Karşılaştırması ---");
        System.out.println("Daire Alanı: " + c.getArea());
        System.out.println("Dikdörtgen Alanı: " + r.getArea());

        if (c.getArea() > r.getArea()) {
            System.out.println("Daha büyük olan nesne: Daire");
        } else if (c.getArea() < r.getArea()) {
            System.out.println("Daha büyük olan nesne: Dikdörtgen");
        } else {
            System.out.println("Alanları birbirine eşit.");
        }
    }
}