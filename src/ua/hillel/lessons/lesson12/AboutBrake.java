package ua.hillel.lessons.lesson12;

public class AboutBrake {
    public static void main(String[] args) {
        breakeExample2();
    }

    public static void breakeExample2() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("First " + i + " times");
            for (int k = 1; k <= 10; k++) {
                System.out.println("Second " + k + " times");
                if (k == 2)
                    break;
            }
        }

    }

    public static void breakeExample1() {
        int a = 1;
        int b = 3;

        while (a <= 5) {
            System.out.println(a + " Iteration of loops");
            if (a == b) {
                break;
            }
            a++;

        }

    }


}
