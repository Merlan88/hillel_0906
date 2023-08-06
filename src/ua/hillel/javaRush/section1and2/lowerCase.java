package ua.hillel.javaRush.section1and2;

import java.util.Locale;
import java.util.Scanner;

public class lowerCase {
    public static void main(String[] args) {
        method();
    }

      public static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        String name2 = name.toLowerCase(Locale.ROOT);
        System.out.println(name2);
        int sum = name2.length();
        System.out.println(sum);
    }
}
