package ua.hillel.homewoks.hm8;

public class HomeWork15 {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11) + 10;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : array) {
            sum += num;
        }
        int average = sum / array.length;
        System.out.println("average: " + average);
    }
}

