package ua.hillel.lessons.lesson10.constructors.explicit;

public class Animal {
    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private String age;

    void seyName() {
        System.out.println(this.name);
    }

    void seyAge() {
        System.out.println(this.age);
    }
}

