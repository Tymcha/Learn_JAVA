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
        int n = 12;
        resultFid = getNumberOffibonacciSeries(n);
        System.out.println(resultFid);

    }

    private static int sumOfDigits(int number) {
        number = Math.abs(number);

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

//    private static int getNumberOffibonacciSeries(int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return getNumberOffibonacciSeries(n - 1) + getNumberOffibonacciSeries(n - 2);
//        }
//    }

    private static int getNumberOffibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int j = 2; j <= n; j++) {
            c = a + b;
            b = a;
            a = c;
        }
        return a;
    }
}




