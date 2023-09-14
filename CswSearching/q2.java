package CswSearching;

import java.util.ArrayList;
import java.util.HashSet;

public class q2 {
    public static void main(String[] args) {
        int[] arr = {5,5,4,4,3,3,2,2,1,1};
        ArrayList<Integer> list = printDuplicates(arr);
        System.out.println(list.toString());
    }

    private static ArrayList<Integer> printDuplicates(int[] arr) {
        ArrayList<Integer> list =  new  ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int  i =0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else
                list.add(arr[i]);
        }
        return list;
    }
}
