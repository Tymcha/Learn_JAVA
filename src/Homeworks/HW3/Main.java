package Homeworks.HW3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
        int[] array = {1, 6, 5 ,8, 1, 6, 9, 7, 8, 4, 3};
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
        int a;
        for (int i = 0; i < array.length-1; i++) {
            a = i;
            array[i] = a;
            System.out.print(array[i] + " ");
        }

    }
}
