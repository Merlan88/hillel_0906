package ua.hillel.javaRush.section3;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp >= 0) {
            System.out.println(warm);
        } else {
            System.out.println(cold);
        }
    }
}
