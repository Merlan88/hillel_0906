package ua.hillel.javaRush.section3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age1 = scanner.nextInt();
        if (age1 < 20 || age1 > 60) {
            System.out.println("можно не работать");
        }
    }
}
