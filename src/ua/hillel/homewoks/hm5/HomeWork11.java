package ua.hillel.homewoks.hm5;

public class HomeWork11 {
    public static void main(String[] args) {
        String[][] doubleArray = {
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}
        };
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
