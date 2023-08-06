package ua.hillel.lessons.lesson5.methods;

public class MethodsWithParams {
    public static void main(String[] args) {
       sum(3,10);
       sayName("Bob", "Saha");
    }
    public static void sayName(String name, String name2){
        System.out.println(name);
        System.out.println(name2);

    }
    public static void sum(int  num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);

    }
//    public static void sayNameANdAge (String name, int age){
//        if(age == 33){
//            s
//        }
//    }
}
