package ua.hillel.homewoks.hm6;

public class HomeWork11 {
    public static void main(String[] args) {
        someName();
    }

    public static void someName() {
        for (int num = 1; num <= 3; num++) {
            if (num == 1 || num == 2) {
                System.out.println("Это " + num + "-й урок!");
                System.out.println("   Я выполнил все домашние задания " + num + "-го урока.");
            } else {
                System.out.println("Это " + num + "-й урок!");
                System.out.println("   Я не выполнил домашние задания " + num + "-го урока.");
            }
        }
    }
}
