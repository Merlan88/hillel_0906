package ua.hillel.lessons.lesson3;

public class ConditionsExample {
    public static void main(String[] args) {
        method2();
    }

    public static void method2() {
        int z = 2;
        int x = 7;

        if (z == x) {
            System.out.println("Digits are the same");
        } else if (z > 6) {
            System.out.println("bigger");
        } else {
            System.out.println("Smaller");
        }
    }


    public static void method() {
        int a = 6;
        int b = 6;
        if (a == b) {
            System.out.println("Digits are same");
        } else {
            System.out.println("Digits are not same");
        }
    }
}
