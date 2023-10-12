package Homeworks.HW3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
        int[] array = {1, 6, 5 ,8, 1, 6, 9, 7, 8, 4, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
        int a;
        for (int i = 0; i < array.length; i++) {
            a = i;
            array[i] = a;
            System.out.print(array[i] + " " );
        }

        System.out.println("\n");
        float[] arrayFloat = {0.2f, 1.63f, 9.51f, 10.3f, 5.55f};

        byte byt = 2;
        short sh = 10;
        int num = 55;
        int[] arr = {byt, sh, num};
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");
        int[][] doubleArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < doubleArray.length ; i++) {
            for (int j = 0; j < doubleArray.length ; j++) {
                System.out.print(doubleArray[i][j]);
            }
            System.out.println("\n");
        }



    }
}
