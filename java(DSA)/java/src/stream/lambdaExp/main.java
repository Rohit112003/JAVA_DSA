package stream.lambdaExp;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        Mathoperation sumOperation = (a , b)-> a+b;
       int res =  sumOperation.operate(1,2);
        System.out.println(res);
        example ex = new example();
        System.out.println( ex.test(5));

        Function<Integer,Integer> doubleit = x-> 2*x;
        System.out.println(doubleit.apply(30));

        Method mt = new Method();
        Function<Integer, Integer> result = mt.andThen(x -> x * 3);
        System.out.println(result.apply(5));

        //method reference
        List<String> st = Arrays.asList("Ram", "rohan ", "ROhit");
        st.forEach(x-> System.out.println(x));
        st.forEach(System.out::println);
























    }






}

@FunctionalInterface
interface Mathoperation{
    int operate(int a, int b);
}
 class example implements Predicate<Integer>{
    @Override
    public boolean test(Integer t){
        if(t%2==0){
            return  true;
        }
        return  false;
    }
}

class Method implements Function<Integer,Integer>{
    @Override
    public Integer apply(Integer x){
        return x*2;
    }
}
