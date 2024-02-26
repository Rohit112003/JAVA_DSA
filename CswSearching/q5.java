package CswSearching;

import java.util.HashSet;

public class q5 {

    public static void main(String[] args) {
        int[] arr = {3,5,2,6,8};
        int min = Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            } else if (max<arr[i]) {
                max = arr[i];

            }
        }
//        System.out.println(max+"" + min );
        HashSet<Integer> set = new HashSet<>();
        for (int i = min; i <= max; i++) {
            set.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            set.remove(arr[i]);
        }
        System.out.println("Missing values: " + set);

    }
}

