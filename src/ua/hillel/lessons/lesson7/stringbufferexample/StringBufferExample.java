package ua.hillel.lessons.lesson7.stringbufferexample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringBufferExample {
    public static void main(String[] args) {
        stringBufferMethod2();

//        public static void stringBufferMethod1(){
//        StringBuffer sb = new StringBuffer();
//        sb.append(new Integer(2));
//        sb.append(false);
//        sb.append(Arrays.asList(3, 4, 5));
//        System.out.println(sb);
    }


    public static void stringBufferMethod2() {
        String number = "0123456789";
        StringBuffer stringBuffer = new StringBuffer(number);

        System.out.println(stringBuffer.substring(3));
        System.out.println(stringBuffer.substring(4,8));
        System.out.println(stringBuffer.replace(4,8, "ABCD"));
        System.out.println(stringBuffer.delete(4,8));
        System.out.println(stringBuffer.deleteCharAt(1));

    }

}
