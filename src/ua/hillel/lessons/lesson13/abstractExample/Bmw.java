package ua.hillel.lessons.lesson13.abstractExample;

public class Bmw extends Car {

    @Override
    String maxSpeed() {
        return "300";
    }

    @Override
    void drive() {
        System.out.println("drive");
    }

    @Override
    void brake() {
        System.out.println("Bmw brake");
    }

    @Override
    void repare() {

    }
}
