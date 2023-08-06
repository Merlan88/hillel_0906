package ua.hillel.lessons.lesson5.twoDimArray;

public class DimArraYExample {
    public static void main(String[] args) {
        emptyDimArray();

    }

    public static void emptyDimArray() {
        int[][] twoDiArray = {
                {5, 7, 3, 17},
                {7, 0, 1, 12},
                {8, 1, 2, 3}
        };
        //     System.out.println(twoDiArray[1][1]);
        //    System.out.println(twoDiArray.length);

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(" " + twoDiArray[i][k] + ' ');
            }
        }

//        int[][] twoDiArray2 = new int[3][4];
//        twoDiArray[0][0] = 5;
//        twoDiArray[0][2] = 7;
//        twoDiArray[0][3] = 3;
//        twoDiArray[1][0] = 17;
//        twoDiArray[1][1] = 7;
//        twoDiArray[1][2] = 0;
//        twoDiArray[1][3] = 1;
//        twoDiArray[0][0] = 12;
//        twoDiArray[2][0] = 8;
//        twoDiArray[2][1] = 1;
//        twoDiArray[2][2] = 2;
//        twoDiArray[2][3] = 3;
    }

}
