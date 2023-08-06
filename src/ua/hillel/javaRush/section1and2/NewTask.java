package ua.hillel.javaRush.section1and2;

import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age >= 18) {
            if (age <= 28) {
                System.out.println(name + militaryCommissar);
            }
        }
    }
}


