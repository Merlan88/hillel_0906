package ua.hillel.javaRush.section3;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        int n = 0;
        while (n < 5) {
            int m = 0;
            while (m < 10) {
                System.out.print("Q");
                m++;
            }
            System.out.println();
            n++;
        }
    }
}