package ua.hillel.homewoks.hm7;

import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Your result: " + result);

    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        return scanner.nextInt();
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter operation: ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static int calc(int num1, int num2, int operation) {
        int result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Operation not allowed");
        }
        return result;
    }
}
