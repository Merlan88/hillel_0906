package ua.hillel.javaRush.section3;

import java.util.Scanner;

public class Equels {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String second = scanner.nextLine();
        if (secret.equalsIgnoreCase(second)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
    }
}


