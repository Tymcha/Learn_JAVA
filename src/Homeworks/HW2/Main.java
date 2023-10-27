package Homeworks.HW2;

import static java.util.Collections.swap;

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

        int k = 5;
        int l = 10;
        System.out.println("k = " + k + ",\t" + "l = " + l);

        k = k ^ l;
        l = k ^ l;
        k = k ^ l;
        System.out.println("k = " + k + ",\t" + "l = " + l);

    }
}
