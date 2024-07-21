package OOP.comparing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions  {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }

//        arr.forEach((item)->System.out.println(item*2));
        Consumer<Integer> fun = ((item)->System.out.println(item*2));
        arr.forEach(fun);
    }

    Operations sum = (a,b)-> a+b;



}


interface  Operations{
    int operation(int a, int b);
}
