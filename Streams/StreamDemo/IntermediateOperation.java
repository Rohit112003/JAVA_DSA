package Streams.StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {

    public static void main(String[] args) {
        //Intermediate operations transform a stream into another stream
        //They are lazy , meaning they don't execute until a terminal operation is invoked

        List<String> list = Arrays.asList("Akshit","Ram","Shyam","Ganshyam");
        //no filtering at this point
        //ye tab tak kaam nahi karega jab tak terminal operation nahi use karte jaise "count()" tab tak yeh store rahega lekin call nahi hoga
      Stream<String> filteredStream=  list.stream().filter(x->x.startsWith("A"));

      long result = list.stream().filter(x->x.startsWith("A")).count();
      System.out.println(result);


      //2map
        //yeh bhi kaam nahi karega jab tak isme kuch terminal operation nahi karenge
        Stream<String > stringStream = list.stream().map(String::toUpperCase);

      //3 sorted

     Stream<String>sortedStream =  list.stream().sorted();
     Stream<String> customSortBySize = list.stream().sorted((a,b)->a.length()-b.length());

     //4 Distinct
        //normal
         System.out.println(list.stream().filter(x->x.startsWith("A")).count());
        //distinct
        list.stream().filter(x->x.startsWith("A")).distinct().count();


      //5 limit
        System.out.println(Stream.iterate(1,x->x+1).limit(100).count());

       //Intermediate
        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).count());





    }
}
