package ua.hillel.lessons.lesson3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        method1();
        method4();
        method3();
    }

    public static void method4() {
        System.out.println("Enter nay phrase");
        Scanner scanner = new Scanner(System.in);
        String phrese = scanner.next();
        System.out.println("Your entered phrase: " + phrese);
    }

    public static void method3() {
        System.out.println("Enter nay phrase");
        Scanner scanner = new Scanner(System.in);
        String phrese = scanner.nextLine();
        System.out.println("Your entered phrase: " + phrese);
    }

    public static void method2() {
        System.out.println("Enter any two digits");
        Scanner scanner = new Scanner(System.in);
        int numberIn1 = scanner.nextInt();
        int numberIn2 = scanner.nextInt();
        int result = numberIn1 + numberIn2;
        System.out.println(result);
    }

    public static void method1() {
        System.out.println("Enter any digit from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int numberIn = scanner.nextInt();
        int result = numberIn + 100;
        System.out.println("Your enter " + numberIn);
        System.out.println("Your Result bigger on 100: " + result);
    }
}
