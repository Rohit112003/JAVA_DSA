package CswSearching;

import java.util.HashMap;
import java.util.Map;

public class q11 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 8, 3};
        int value = 10;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = value - arr[i];

            if (map.containsKey(complement)) {
                int index = map.get(complement);
                System.out.println(" " + value + " " + arr[index] + " " + arr[i]);
                return;
            }

            map.put(arr[i], i);
        }
    }
}
