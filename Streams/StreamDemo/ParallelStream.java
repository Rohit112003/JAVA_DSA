package Streams.StreamDemo;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1,x->x+1).limit(20000).toList();
        List<Long> factorialList = list.parallelStream().map(ParallelStream:: factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        //parallel stream are most effective for cpu intensive or large stream where tasks
//        are independent
        //they may add overhead for simple tasks or small datasets
    }
    private static long factorial(int n){
        long result = 1;
        for(int i =2; i<=n;i++){
            result*=i;
        }
        return result;
    }
}
