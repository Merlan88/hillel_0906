package ua.hillel.lessons.lesson4.switchexample;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        condition();
    }

    public static void condition() {
        System.out.println("Please enter 1, 2 or 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Вы ввели 1");
                break;
            case 2:
                System.out.println("Вы ввели 2");
                break;
            case 3:
                System.out.println("Вы ввели 3");
                break;
            default:
                System.out.println("You entered another number");
        }

    }

}
