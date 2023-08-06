package ua.hillel.homewoks.hm6;

public class HomeWork12 {
    public static void main(String[] args) {
        piramid();
    }

    public static void piramid() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
