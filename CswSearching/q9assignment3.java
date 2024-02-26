package CswSearching;

import java.util.ArrayList;
import java.util.HashSet;

public class q9assignment3 {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,9};
        int[] arr2 = {2,3,4,19,7};
        HashSet<Integer> set = new HashSet<>();
//    int arr3[] = new int[arr.length + arr2.length];

//        ArrayList<Integer> list = new ArrayList<>();
        int arr3[] = new int[arr.length + arr2.length];
        for(int i = 0; i<arr.length;i++){
            arr3[i] = arr[i];
        }
        for(int i = 0; i<arr2.length;i++){
            arr3[i] = arr2[i];
        }
        for(int i = 0; i<arr3.length;i++){
            set.add(arr3[i]);

        }
        System.out.println(set);
    }


}
