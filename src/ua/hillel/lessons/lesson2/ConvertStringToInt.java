package ua.hillel.lessons.lesson2;

public class ConvertStringToInt {
    public static void main(String[] args) {
//преобразовать число в строку
        int a = 5;
        String str = "" + a;
        System.out.println("String " + str);

//преобразовать строку в число
        String str1 = "123";
        int int1 = Integer.parseInt(str1);
        System.out.println("Int " + int1);
    }
}
