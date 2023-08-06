package ua.hillel.lessons.lesson8.oop;

import java.util.Scanner;

public class Oop extends Cat {
    public static void main(String[] args) {

        //stack     -->     //heap

        Cat cat = new Cat();
        cat.sayHello();
        System.out.println("test " + cat.color);

    }
}
