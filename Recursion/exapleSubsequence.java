package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class exapleSubsequence {
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        checkSequence(arr,0,list);

    }

    private static void checkSequence(int[] arr, int i, ArrayList<Integer> list) {
        if(i>=arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        checkSequence(arr,i+1,list);
        list.remove(list.size() - 1);
        checkSequence(arr,i+1,list);

    }
}
