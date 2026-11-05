package edu.tr.istiklal;

public class TestSquare {
    public static void main(String[] args) {
        // 5 elemanlı bir GeometricObject dizisi oluşturma
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Circle(4.0);
        objects[1] = new Rectangle(3.0, 5.0);
        objects[2] = new Square(6.0);
        objects[3] = new Circle(2.5);
        objects[4] = new Square(4.5);

        // Dizideki her nesne için alanı yazdırma ve Colorable ise howToColor çağırma
        for (int i = 0; i < objects.length; i++) {
            System.out.println("--- Nesne " + (i + 1) + " ---");
            System.out.println("Alan: " + objects[i].getArea());

            // Nesnenin Colorable arayüzünü uygulayıp uygulamadığını kontrol etme
            if (objects[i] instanceof Colorable) {
                ((Colorable) objects[i]).howToColor();
            }
            System.out.println();
        }
    }
}