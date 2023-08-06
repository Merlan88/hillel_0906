package ua.hillel.lessons.lesson4.arreys;

public class ArreysExample {
    public static void main(String[] args) {


        int[] arrayInt = {1, 3, 4, 5}; //создание массива
        String[] arrayStr = {"Alex", "Igor", "Kostya"};

        int arrayLengt = arrayInt.length;
        System.out.println(arrayLengt);

        int arrayLengthStr = arrayStr.length;
        System.out.println(arrayLengthStr);

        System.out.println(arrayStr[1]);
        System.out.println(arrayInt[2]);


        int[] array1 = new int[3]; //создание пустого массива
        System.out.println(array1[1]);
        array1[0] = 10;
        array1[1] = 150;
        array1[2] = 200;

        System.out.println(array1[0]);

        int[] array2 = new int[3];
        System.out.println(array2[0]);

        String [] array3 = new String[3];
        System.out.println(array3[0]);

        boolean[] array4 = new boolean[3];
        System.out.println(array4[0]);

        char[] array5 = new char[3];
        System.out.println(array5[0]);

        double[] array6 = new double[3];
        System.out.println(array6[0]);
    }
}
