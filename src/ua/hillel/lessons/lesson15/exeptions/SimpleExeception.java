package ua.hillel.lessons.lesson15.exeptions;

public class SimpleExeception {
    public static void main(String[] args) {
        structureException();

    }

    static void structureException() {
        try {
         //   System.out.printf(5 / 0);
        } catch (ArithmeticException num) {
            System.out.printf("Not Possible");
        }
        System.out.println("next");
    }
}
