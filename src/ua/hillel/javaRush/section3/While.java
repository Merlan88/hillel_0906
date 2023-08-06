package ua.hillel.javaRush.section3;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int mun = 0;
        while (mun < 10) {
            System.out.println(name + text);
            mun++;
        }
    }
}
