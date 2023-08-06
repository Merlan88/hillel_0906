package ua.hillel.lessons.lesson12;

public class New {
    public static void main(String[] args) {
        int i = factorialRecursion(3);
        System.out.println(i);
    }

    static int factorialRecursion(int x) {
        int result;
        if(x < 1){
            return 1;
        }
        result = factorialRecursion(x - 1) * x;
        // result = factorialRecursion(3- 1)* x;
        // result = factorialRecursion(2- 1)* x;
        // result = factorialRecursion(1- 1)* x;
        return result;

    }
}
