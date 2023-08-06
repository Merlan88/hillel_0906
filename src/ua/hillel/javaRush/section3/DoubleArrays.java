package ua.hillel.javaRush.section3;

public class DoubleArrays {
    public static void main(String[] args) {

        int[][] doubleArray = {
                {1, 2, 3,},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
