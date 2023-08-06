package ua.hillel.lessons.lesson13.enums;

public class Launch {
    public static void main(String[] args) {
        gotomenu (Border.MAIN);

    }

    static void gotomenu(Border border){
        switch (border){
            case MAIN:
                System.out.println("GO to Main");
            case PRODUCTS:
                System.out.println("GO to PRODUCTS");
            case CONTACTS:
                System.out.println("GO to CONTACTS");
                break;

        }

    }
}
