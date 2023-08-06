package ua.hillel.lessons.lesson6;

public class SomeStringsMethods {
    public static void main(String[] args) {
        valueOf();
    }

    public static void equalsExample2(String str1, String str2) { //Сравнивает две строки на равенство без учета регистра символов.
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("=");
        } else {
            System.out.println("!=");
        }
    }

    public static void equalsExample(String str1, String str2) {
        if (str1.equals(str2)) { //Сравнивает две строки на равенство.
            System.out.println("=");
        } else {
            System.out.println("!=");
        }
    }

    public static void lastIndexOf() {
        String str1 = "Hello";
        System.out.println(str1.indexOf("l")); //Возвращает индекс первого вхождения подстроки.
        System.out.println(str1.lastIndexOf("el")); //Возвращает индекс последнего вхождения подстроки.

    }

    public static void valueOf() {
        int num = 3213;
        String str = String.valueOf(num); // преобразует int в String
        System.out.println(str);
        System.out.println(str.indexOf("3"));

    }

    public static void parseInt() {
        String str = "3213";
        int num1 = Integer.parseInt(str); //Преобразует строку в целое число типа int.
        System.out.println(num1 == 3213);

    }


}