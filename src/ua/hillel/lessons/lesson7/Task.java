package ua.hillel.lessons.lesson7;

public class Task {
    public static void main(String[] args) {

        int max = 0;
        int [] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            // (Math.random() * (b-a) ) + a
            array[i] = (int) (Math.random() * 101);
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max element = " + max);
    }


}
