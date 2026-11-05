package edu.tr.istiklal;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        stack1.push("Kahramanmaraş");
        stack1.push("İstiklal");
        stack1.push("Yazılım");

        // stack1'in derin kopyasını alarak stack2'yi oluşturma
        MyStack stack2 = (MyStack) stack1.clone();

        // Kopyalama sonrası stack1'e yeni eleman ekleme
        stack1.push("Mühendisliği");

        // İki yığının bağımsız olduğunu teyit etme
        System.out.println("--- Orijinal Yığın (stack1) ---");
        System.out.println(stack1);

        System.out.println("\n--- Derin Kopyalanan Yığın (stack2) ---");
        System.out.println(stack2);

        System.out.println("\nEleman sayıları -> stack1: " + stack1.getSize() + ", stack2: " + stack2.getSize());
    }
}