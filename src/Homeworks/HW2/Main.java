package Homeworks.HW2;

public class Main {
    public static void main(String[] args) {
        int age = 20;
        float weight = 70f;
        String name = "Andriy";

        System.out.println("Name: " + name + ",\t" +
                            "Age: " + age + ",\t" +
                            "Weighht: " + weight + "\n");

        int a = 1;
        int b = 2;
        int c;
        System.out.println("a = " + a + ",\t" + "b = " + b);

        c = b;
        b = a;
        a = c;
        System.out.println("a = " + a + ",\t" + "b = " + b);
    }
}
