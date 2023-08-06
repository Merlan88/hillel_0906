package ua.hillel.lessons.lesson4.loops;

public class ForEach {
    public static void main(String[] args) {
        second();

    }

    public static void first() {
        int[] arr = {2, 4, 6};
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void second() {
        String[] arrStr = {"Alex", "Bob", "Sam"};
        for (String names : arrStr) {
            System.out.println(names + " Petrov");
        }
    }
}