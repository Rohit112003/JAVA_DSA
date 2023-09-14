package CswSearching;

import java.util.HashSet;

public class q1 {
    public static void main(String[] args) {
        int[] arr = { 5,4,4,3,21};
       int ans =  fixndRepeated(arr);
        System.out.println(ans);
    }

    private static int fixndRepeated(int[] arr) {
        HashSet<Integer> set  = new HashSet<>();
        for(int  i =0;i<arr.length;i++){
            if(!set.contains(arr[i])){
              set.add(arr[i]);
            }else return arr[i];
        }
        return -1;

    }


}
