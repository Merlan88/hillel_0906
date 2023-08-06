package ua.hillel.lessons.lesson10;

public class LogicalOperators {
    public static void main(String[] args) {
        oneOperatorTwo();
    }

    public static void oneOperatorTwo() {
        int a = 10;

        if (++a== 10 && ++a == 12) {
            System.out.println("МОжно кормить кота");
            ++a;
        }
        System.out.println(a);
    }

    public static void oneOperatorOr() {
        int mouse = 5;
        int weight = 45;

        if (mouse == 7 | weight < 100) {
            System.out.println("МОжно кормить кота");
        }
    }

    public static void oneOperator() {
        int mouse = 5;
        int weight = 45;

        if (mouse != 0 & weight < 100) {
            System.out.println("МОжно кормить кота");
        }
    }
}
