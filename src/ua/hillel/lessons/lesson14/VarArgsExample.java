package ua.hillel.lessons.lesson14;

public class VarArgsExample {
    public static void main(String[] args) {
        String names = nameHanler("alex ", "oleg ", "bob");
        System.out.println(names);

        String name2 = nameHanler("Alex ", "Sam ");
        System.out.println(name2);
    }

    static String nameHanler(String... name) {
        String str = null;
        for (String n : name) {
            str += n.toUpperCase();
        }
        return str;
    }

    static String nameHanler(String nam1, String name2, String name3) {
        return nam1.toUpperCase() + name2.toUpperCase() + name3.toUpperCase();
    }
}
