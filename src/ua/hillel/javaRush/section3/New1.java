package ua.hillel.javaRush.section3;

public class New1 {
    public static void main(String[] args) {
        int sum = 0;
        int bum = 0;
        for (int i = 1; i <= 5; ++i)
            sum += 1;
        for (int i = 1; i <= 5; i++)
            bum += 1;
        if (sum == bum)
            System.out.println(1);
        else
            System.out.println(0);
    }
}

