package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class kSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int ans = Ksmall(arr, k);
        System.out.println(ans);
    }

    private static int Ksmall(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
