package ua.hillel.lessons.lesson7.switchInJava;

public class SwitchJava12 {
    public static void main(String[] args) {
        modiffSwitch();
    }

    public static void modiffSwitch() {
        int some = 2;
        int value = switch (some) {
            case 1, 5, 6 -> 32;
            case 2 -> 33;
            case 3 -> 34;
            case 4 -> 35;
            default -> 0;
        };


    }


//        int cout = 2;
//        int value;
//        switch (cout) {
//            case 1:
//                value = 32;
//                break;
//            case 2:
//                value = 44;
//                break;
//            case 3:
//                value = 78;
//                break;
//            default:
//                value = 0;
//        }


}

