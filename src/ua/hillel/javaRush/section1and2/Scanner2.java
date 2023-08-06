package ua.hillel.javaRush.section1and2;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        int a = one.nextInt();
        int b = one.nextInt();
        int c = one.nextInt();
        int d = (a + b + c)/3;
        System.out.println(d);
    }
}
