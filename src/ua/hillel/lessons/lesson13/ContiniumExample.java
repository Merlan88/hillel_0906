package ua.hillel.lessons.lesson13;

public class ContiniumExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " will be first");
            if (i > 2)
                continue;
            System.out.println("   " + i + " two times");
        }

    }
}
