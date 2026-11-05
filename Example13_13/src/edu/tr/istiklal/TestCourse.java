package edu.tr.istiklal;

public class TestCourse {
    public static void main(String[] args) {
        // Orijinal ders oluşturma ve öğrenci ekleme
        Course course1 = new Course("Yazılım Mühendisliği");
        course1.addStudent("Enis");
        course1.addStudent("Yunus");
        course1.addStudent("Yusuf");

        // Dersin derin kopyasını (clone) alma
        Course course2 = (Course) course1.clone();

        // Klonlanan derse yeni öğrenci ekleme
        course2.addStudent("Çağrı");

        // İki dersin öğrenci listelerinin bağımsız olduğunu kontrol etme
        System.out.println("--- Course 1 Öğrenci Sayısı ---");
        System.out.println(course1.getCourseName() + ": " + course1.getNumberOfStudents() + " öğrenci");
        System.out.print("Öğrenciler: ");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(course1.getStudents()[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : ""));
        }

        System.out.println("\n\n--- Course 2 (Klonlanan) Öğrenci Sayısı ---");
        System.out.println(course2.getCourseName() + ": " + course2.getNumberOfStudents() + " öğrenci");
        System.out.print("Öğrenciler: ");
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(course2.getStudents()[i] + (i < course2.getNumberOfStudents() - 1 ? ", " : ""));
        }
        System.out.println();
    }
}