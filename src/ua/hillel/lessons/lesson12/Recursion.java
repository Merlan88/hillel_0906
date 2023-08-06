package ua.hillel.lessons.lesson12;

public class Recursion {
    public static void main(String[] args) {
        int a = factorial(3);
        System.out.println(a);
    }

    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
            // 1 = 1 * 1
            // 1 = 1 * 2
            // 2 = 2 * 3
        }
        return result;

    }
}
