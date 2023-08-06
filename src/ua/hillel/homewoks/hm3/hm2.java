package ua.hillel.homewoks.hm3;

import java.util.Scanner;

public class hm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your First number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter your Second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Please enter your name:");
        String name = scanner.next();

        int result = firstNumber + secondNumber;

        System.out.println(name + " " + result);
    }
}
