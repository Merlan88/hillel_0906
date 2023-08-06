package ua.hillel.javaRush.section3;
import java.util.Scanner;

public class TaskScanner {
    public static void main(String[] args)
    {
        String str = "10 20 40 60"; //сканер выводит каждое последующее значение
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b + d + c);
    }
}

