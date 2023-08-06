package ua.hillel.lessons.lesson7.split;

public class SplitExample {
    public static void main(String[] args) {
        String str = "Hello my name is Max";
        String[] word = str.split(" ");
        System.out.println(word[2]);


        for (String w : word) {
            System.out.println(w);
        }


    }
}
