package Homeworks.HW6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int number = 25;
        int number = scan.nextInt();
        int result = sumOfDigits(number);
        System.out.println("The sum is " + result);

        int resultFid;
        int n = 11;
        resultFid = getNumberOffibonacciSeries(n);
        System.out.println(resultFid);

    }

    private static int sumOfDigits(int number) {
        // Make sure the number is positive
        number = Math.abs(number);

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            sum += digit;             // Add the last digit to the sum
            number /= 10;             // Remove the last digit
        }
        return sum;
    }


    private static int getNumberOffibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}




