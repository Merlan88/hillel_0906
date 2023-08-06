package ua.hillel.lessons.lesson6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        myTask();

    }

    public static void myTask() {
        Scanner str1 = new Scanner(System.in);
        System.out.println("Введите слова");
        String str = str1.nextLine();

        int count = 0;

        if (str.length() != 0) {
            count++;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }

        }
        System.out.println("Вы ввели " + count + " слово");
    } //3481300920
}
