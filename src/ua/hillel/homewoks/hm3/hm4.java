package ua.hillel.homewoks.hm3;

import java.util.Scanner;

public class hm4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3");
        int num1 = scanner.nextInt();
        if (num1 == 1 || num1 == 2 || num1 == 3) {
            System.out.println("Вы ввели: " + num1);
        } else {
            System.out.println("Вы 3ввели число не равное 1, 2 или 3");
        }
    }
}

