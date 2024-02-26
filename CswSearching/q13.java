package CswSearching;

import java.util.Arrays;

public class q13 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Arrays.sort(arr);
        int first = 0;
        int minDiff = Integer.MAX_VALUE;
        int second = 0;
        for(int i = 0; i<arr.length-1;i++){
            int min = arr[i]- arr[i+1];
            if(minDiff>min){
                minDiff = min;
                first = arr[i];
                second = arr[i+1];
            }
        }
        System.out.println(minDiff +" " + first+ " "+ second);
    }
}
