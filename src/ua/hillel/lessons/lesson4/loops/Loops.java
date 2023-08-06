package ua.hillel.lessons.lesson4.loops;

public class Loops {
    public static void main(String[] args) {
        whileExample2();
    }


    public static void whileExample1() {
        int i = 1;
        while (i < 8) {
            System.out.println(i + " ");
            i++;
        }

    }

    public static void whileExample2() {
        int i = 100;
        while (i >= 10) {
            System.out.println("Обратный отсчет " + i + " ");
            i -= 10;
            // i = i -10;
        }
    }
}
