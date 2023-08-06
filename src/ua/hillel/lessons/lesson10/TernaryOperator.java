package ua.hillel.lessons.lesson10;

public class TernaryOperator {
    public static void main(String[] args) {
        conditionSimple("test");
        conditionSimple("test!");


    }
    public static void conditionSimple (String str) {
        var lastChar = str.charAt(str.length()- 1);
        String result = (lastChar == '!') ? "question" : "no question";
        System.out.println(result);
    }




//    public static void conditionSimple(String str){
//        var lastChar = str.charAt(str.length() - 1);
//        if (lastChar == '?'){
//            System.out.println("Question");
//        } else {
//            System.out.println("No question");
 //       }
  //  }
}
