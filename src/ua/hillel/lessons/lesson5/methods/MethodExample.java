package ua.hillel.lessons.lesson5.methods;

public class MethodExample {
    public static void main(String[] args) {
        System.out.println(plus());
        System.out.println(returnInterativ());
        System.out.println(returnDeklar());
    }

    public static String returnInterativ() {
        String hello = "Interativ";
        return hello;

    }

    public static String returnDeklar() {
        return "Deklar";
    }


    public static int plus(){
        int result = 2 + 2;
        return result;
    }

}
