package ua.hillel.homewoks.hm10;

public class HomeWork19 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int someNum = 7;
        int[] newArray = combining(a, someNum);

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] combining(int[] array, int number) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = number;
        return newArray;
    }
}