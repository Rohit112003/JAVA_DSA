package TCS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class DuplicatesArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        removeDuplicatesfromarr(arr);
    }

    private static void removeDuplicatesfromarr(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<arr.length ;i++){
            set.add(arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: set){
            list.add(num);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
