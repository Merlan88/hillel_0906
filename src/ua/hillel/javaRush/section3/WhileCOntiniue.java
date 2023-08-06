package ua.hillel.javaRush.section3;

public class WhileCOntiniue {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 99)
        {
            i++;
            if ( (i % 3) == 0)
                continue;
            System.out.println(i);
        }
    }
}
