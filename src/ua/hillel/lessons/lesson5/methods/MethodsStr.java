package ua.hillel.lessons.lesson5.methods;

public class MethodsStr {
    public static void main(String[] args) {
        stringReplace();
    }

    public static void stringLength() { //Возвращает длину строки.
        String str = "hello my friend";
        System.out.println(str.length());
    }

    public static void stringTrim() {//Удаляет начальные и конечные пробелы строки.
        String str = "       streing     ";
        System.out.println(str);
        System.out.println(str.trim());
    }

    public static void stringCharAt() {//Возвращает символ строки по указанному индексу.
        String str = "Hello World";
        System.out.println(str.charAt(0));
    }

    public static void stringIndexOf() { //Возвращает индекс первого вхождения подстроки.
        String str = "Hello World";
        System.out.println(str.indexOf("W"));

    }
    public static void stringLastIndexOf() { //Возвращает индекс последнего вхождения подстроки.
        String str = "Hello World";
        System.out.println(str.lastIndexOf("o"));

    }
    public static void stringSubstring() { //Возвращает подстроку, начиная с указанного начального индекса и до конца строки.
        String str = "Hello World";
        System.out.println(str.substring(7));
//        System.out.println(str.substring(4,7));

    }
    public static void   stringReplace(){ //Заменяет все вхождения указанного символа на новый символ.
        String str = "Hello World here";
        String str2 = str.replace("World", "all");
        System.out.println(str2);
    }

}


//    public static void stringEndsWith(){
//        String str = "Hello world";
//        boolean end1 = str.stringEndsWith();
//        boolean end2 = str.stringEndsWith();
//        System.out.println(end1);
//        System.out.println(end2);
//    }
