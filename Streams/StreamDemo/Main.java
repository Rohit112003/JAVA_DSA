package Streams.StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    //feature introduced in java 8
    //process collections of data in a functional and declarative manner
    //simplify data processing
    //Embrace Functional Programming
    //Improve Readability and Maintainability
    //Enable Easy Parallelism

    //what is Stream?
    //a sequence of elements supporting functional and declarative programming

    //How to use Streams
    //Source, intermediate operations & terminal operation

    public static void main(String[] args) {

        List<Integer> numbers  = Arrays.asList(1,2,3,4,5);
        int count=0;
        for(int i :numbers){
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(numbers.stream().filter(x->x%2==0).count());

        //creating Streams
        //1. From Collections
        List<Integer> list  = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        //2From arrays
        String [] array = {"a","b","c"};
        Stream<String> stream1 = Arrays.stream(array);

        //3 using Stream.of()
        Stream<String> stream2 = Stream.of("a","b");

        //4 Infinite Streams
        Stream<Integer>generate = Stream.generate(()->1).limit(100);
        List<Integer> collect = Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toList());
//        System.out.println(collect);


    }



}
