package Streams.StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        Integer sum= Integer.sum(a,b);
        List<Integer> list = Arrays.asList(1,2,3);

//        1 collect
//        accumulates the elements of this stream into a Lis
        list.stream().skip(1).toList();

//        2 foreach
        list.stream().forEach(System.out::println);

        //3 reduce : combines elements to produce a single result
       Optional<Integer> optionalInteger= list.stream().reduce((x, y)->x+y);
        System.out.println(optionalInteger.get());
        
//        4 count
        
        //5 anyMatch , allMatch ,noneMatch
        boolean b1 = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b1);
        boolean b2 = list.stream().allMatch(x->x>0);
        System.out.println(b2);

        boolean b3 = list.stream().noneMatch(x->x<0);
        System.out.println(b3);

        //6 findFirst , findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());


//        Example :Filtering and collecting names
        List<String> names = Arrays.asList("Anna","Bob", "Charlie","David");
        System.out.println(names.stream().filter(x->x.length()>3).toList());

        //Example : squaring and sorting Numbers
        List<Integer> numbers = Arrays.asList(5,2,9,1,3);
        System.out.println(numbers.stream().map(x->x*x).sorted().toList());

        //Example :Summing values
        List<Integer> val = Arrays.asList(1,2,3,4,5);
        System.out.println(val.stream().reduce(Integer::sum).get());

        //Example: counting Occurrences of character
        String sentence = "Hello world";
        System.out.println(sentence.chars().filter(x-> x=='l').count());


        //stateful & stateless


    }


}
