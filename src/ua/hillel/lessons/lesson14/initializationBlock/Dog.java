package ua.hillel.lessons.lesson14.initializationBlock;

public class Dog {
    private String name;
    private String bread;
    private int age;

    {
        name = "rex";
        bread = "Mops";
        age = 20;
    }
     static String lastName;
    static   {
        lastName = "Popov";
    }

    public Dog() {
    }

    public Dog(String name, String poroda, int age) {
        this.name = name;
        this.bread = bread;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public int getAge() {
        return age;
    }
}
