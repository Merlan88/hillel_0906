package ua.hillel.lessons.lesson13.interfaceExample;

public class Tayota implements Car {
    @Override
    public void getPassenger() {
        System.out.println("getPassenger ");
    }

    @Override
    public void passengerPay() {
        System.out.println("passengerPay");

    }

    @Override
    public void passengerPlaces() {
        System.out.println("passengerPlaces");
    }

    @Override
    public void priceForKm() {
        System.out.println("priceForKm");

    }
}
