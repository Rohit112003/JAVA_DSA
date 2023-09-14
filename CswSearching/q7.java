package CswSearching;

import java.util.HashMap;
import java.util.HashSet;

public class q7 {
    public static void main(String[] args) {
        int[] arr = {5,5,4,4,3,3,2,2,1};
        int ans = findOddRepeated(arr);
        System.out.println(ans);
    }

    private static int findOddRepeated(int[] arr) {
        HashMap<Integer, Integer> set  = new HashMap();
        for(int i = 0; i<arr.length; i++){
            if(set.containsKey(arr[i])){
                set.put(arr[i], set.get(arr[i]+1));
            }else{
                set.put(arr[i], 1);
            }

        }
        for(int val:set.keySet()){
            if(set.get(val)%2!=0){
                return val;
            }

        }
        return -1;

    }
}
