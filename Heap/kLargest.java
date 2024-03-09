package Heap;

import java.util.PriorityQueue;

public class kLargest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int ans = Klarge(arr, k);
        System.out.println(ans);
    }

    private static int Klarge(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i<arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k){
//                System.out.println(   pq.poll());
            }
        }
        return pq.peek();


    }
}
