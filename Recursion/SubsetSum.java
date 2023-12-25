package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        subsetsum(arr,list,0,0);
        System.out.println(list.toString());
    }

    private static void subsetsum(int[] arr, ArrayList<Integer> list, int i,int sum) {
        if(i==arr.length){
            list.add(sum);
            return;

        }
        subsetsum(arr,list,i+1,sum+arr[i]);
        subsetsum(arr,list,i+1,sum);
    }
}
