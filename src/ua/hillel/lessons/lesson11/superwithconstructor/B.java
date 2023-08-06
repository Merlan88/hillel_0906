package ua.hillel.lessons.lesson11.superwithconstructor;

public class B extends A{

    public B(){
        System.out.println("B- Method without params");

    }
    public B(int value){
        super(1);
        System.out.println("Method B with params " + value);
    }
}
