package Streams;

import java.util.Arrays;
import java.util.List;

public class MethodRefernce {
    //Method reference allow us to refer to method without invoking it making aur code cleaner and more readable . They can be used in place of
    // lambda expression when the lambda expression only calls and existing method

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice","Bob","Charlie");
        students.forEach(MethodRefernce::print);
    }


}
