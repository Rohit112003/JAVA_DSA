package Assignment;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ksmallest {
    public static void main(String[] args) {
        int[] arr = { 1,3,5,2,4};
        int k = 2;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i<arr.length; i++){
            minHeap.add(arr[i]);
        }

        int i = 1;
        while(i<k){
            System.out.println(minHeap);
            minHeap.poll();
            System.out.println(minHeap);
            i++;
        }

        System.out.println( minHeap.peek());


    }
}
