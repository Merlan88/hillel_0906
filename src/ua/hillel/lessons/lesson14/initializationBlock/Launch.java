package ua.hillel.lessons.lesson14.initializationBlock;

public class Launch {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getName());
        System.out.println(dog.getBread());
        System.out.println(dog.getAge());

        System.out.println(Dog.lastName);


    }
}
