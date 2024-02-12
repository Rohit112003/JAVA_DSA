package Assignment;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int ans = Majority(arr);
        System.out.println(ans);
    }

    private static int Majority(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int major=Integer.MIN_VALUE;
        int ans = 0;
        for(Map.Entry<Integer, Integer> mapEntry: map.entrySet()){
            if(major<mapEntry.getValue()){
                major = mapEntry.getValue();
                ans =mapEntry.getKey();

            }

        }
        return ans;
    }
}
