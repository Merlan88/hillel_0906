package ua.hillel.lessons.lesson8.oop.polymorfizm;

public class OverloadExample {
    //Overload
    //Override

    public static void main(String[] args) {
        // обьект принимает различные обстракции и формы
        System.out.println(add());
        System.out.println(add(1,2));
        System.out.println(add("test", " tata"));
    }
    public static int add(int a, int b) {
        return a + b;

    }
    public static String add(String a, String b) {
        return a + b;

    }
    public static String add() {
        return "'a' + 'b'";
    }
}