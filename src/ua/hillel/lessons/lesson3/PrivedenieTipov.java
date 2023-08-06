package ua.hillel.lessons.lesson3;

public class PrivedenieTipov {
    public static void main(String[] args) {
         //автоматическо/ не явное
        int a = 15;
        long b = a;
        System.out.println(b);

        //неавтоматичекое/ явное
        int z = 0;
        long x = 15;
        z = (int) x;
        System.out.println(z);
        //явное привидение даьл
        double q = 11.432;
        int w = (int) q;
        System.out.println(w);

    }
}
