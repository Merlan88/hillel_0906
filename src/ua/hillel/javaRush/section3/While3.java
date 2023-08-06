package ua.hillel.javaRush.section3;

import java.util.Scanner;


public class While3 {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();
            if(s.equals("enough")) {
              break;
          }               System.out.println(s);

        }
    }
}
