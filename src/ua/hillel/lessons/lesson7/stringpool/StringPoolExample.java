package ua.hillel.lessons.lesson7.stringpool;

public class StringPoolExample {
    public static void main(String[] args) {

        String str1 = "ALex";
        String str2 = "ALex";

        String str3 = new String("ALex").intern(); //intern() отправляет в стринг пул
        String str4 = new String("ALex").intern();


        System.out.println(str1 == str2); //проверяет ссылку в памяти на обьект

        System.out.println(str3 == str4);

        System.out.println(str1 == str3);

    }
}
