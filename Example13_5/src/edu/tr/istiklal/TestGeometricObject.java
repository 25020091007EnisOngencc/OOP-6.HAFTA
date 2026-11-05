package edu.tr.istiklal;

public class TestGeometricObject {
    public static void main(String[] args) {
        // İki adet Circle (Daire) nesnesi oluşturma
        GeometricObject circle1 = new Circle(5.0);
        GeometricObject circle2 = new Circle(7.5);

        // İki adet Rectangle (Dikdörtgen) nesnesi oluşturma
        GeometricObject rectangle1 = new Rectangle(4.0, 5.0);
        GeometricObject rectangle2 = new Rectangle(3.0, 8.0);

        // max metodunu kullanarak büyük daireyi bulma
        GeometricObject largerCircle = GeometricObject.max(circle1, circle2);
        System.out.println("--- Daha Büyük Olan Daire ---");
        System.out.println(largerCircle);

        System.out.println();

        // max metodunu kullanarak büyük dikdörtgeni bulma
        GeometricObject largerRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("--- Daha Büyük Olan Dikdörtgen ---");
        System.out.println(largerRectangle);
    }
}