package ua.hillel.lessons.lesson7.switchInJava;

public class SwitchJava7 {
    public static void main(String[] args) {

        int month = 3;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "July";
                break;
            default:
                monthString = "Unknown month";
        }


    }


}
