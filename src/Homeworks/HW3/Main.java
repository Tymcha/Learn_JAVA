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

        float[] arrayFloat = {0.2f, 1.63f, 9.51f, 10.3f, 5.55f};

        byte byt = 2;
        short sh = 10;
        int num = 55;
        int[] arr = {byt, sh, num};
        for (int i = 0; i < arr.length - 1 ; i++) {
            System.out.println(arr[i]);
        }



    }
}
