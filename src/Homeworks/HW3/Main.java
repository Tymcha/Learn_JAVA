package Homeworks.HW3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a;
        Scanner in = new Scanner(System.in);
        int numberOfTheDay = in.nextInt();

        while (numberOfTheDay != -1) {
            numberOfTheDay = in.nextInt();

            switch (numberOfTheDay) {
                case 1:
                    System.out.println("Junuary");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("august");
                    break;
            }
        }
    }
}
