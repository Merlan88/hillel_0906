package ua.hillel.homewoks.hm5;

public class HomeWork10 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;
        int minResult = minNum(num1, num2);
        System.out.println(minResult);
    }

    public static int minNum(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}