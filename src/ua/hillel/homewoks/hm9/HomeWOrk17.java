package ua.hillel.homewoks.hm9;

public class HomeWOrk17 {
    public static void main(String[] args) {
        String[] array = new String[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(i + 1);
        }
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) % 2 == 0) {
                array[i] = "Y";
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
