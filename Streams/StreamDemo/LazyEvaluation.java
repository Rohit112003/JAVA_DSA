package Streams.StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<String> names  = Arrays.asList("Alice","Bob","Charlie","David");

        Stream<String> stream = names.stream().filter(name->
        {System.out.println("Filtering: "+ name);
            return name.length()>3;

        });
//        long a = names.stream().filter(name-> name.length()>3).count();


        System.out.println("Before terminal Operation");
        List<String> result = stream.collect(toList());
        System.out.println("After terminal Operation");
        System.out.println(result);
    }
}
