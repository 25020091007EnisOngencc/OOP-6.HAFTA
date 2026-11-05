package edu.tr.istiklal;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üç kenar uzunluğunu alma
        System.out.print("Üçgenin üç kenarını girin (örn: 1.0 2.0 3.0): ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Kullanıcıdan renk alma
        System.out.print("Üçgenin rengini girin: ");
        String color = input.next();

        // Kullanıcıdan doluluk durumu alma (true/false)
        System.out.print("Üçgen dolu mu? (true veya false girin): ");
        boolean filled = input.nextBoolean();

        // Triangle nesnesi oluşturma
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Sonuçları ekrana yazdırma
        System.out.println("\n--- Üçgen Bilgileri ---");
        System.out.println(triangle.toString());
        System.out.println("Alan: " + triangle.getArea());
        System.out.println("Çevre: " + triangle.getPerimeter());
        System.out.println("Renk: " + triangle.getColor());
        System.out.println("Dolu mu?: " + triangle.isFilled());
        
        input.close();
    }
}