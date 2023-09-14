package CswSearching;

import java.util.ArrayList;
import java.util.HashSet;

public class q3 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,1};
        Duplicates(arr);
//        ArrayList<Integer> ans  = Duplicates(arr);
    }

    private static void Duplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);


        }
        System.out.println(set);

    }


}
