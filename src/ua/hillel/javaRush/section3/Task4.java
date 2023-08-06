package ua.hillel.javaRush.section3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c && c == a) {
            System.out.print(a + " " + b + " " + c);
        } else if (b == c) {
            System.out.print(b + " " + c);
        } else if (a == c) {
            System.out.print(a + " " + c);
        } else if (a == b) {
            System.out.print(a + " " + b);
        }
    }
}
