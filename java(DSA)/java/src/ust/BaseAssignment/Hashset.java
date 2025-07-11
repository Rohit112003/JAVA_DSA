package ust.BaseAssignment;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = {1,1,2,3,4,5,5,6,6,7,7};
        forHashSet(arr,set);
        forHashMap(arr,map);
    }

    private static void forHashMap(int[] arr, HashMap<Integer, Integer> map) {
        for(int i =0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        System.out.println("HashMap");
        for(Map.Entry<Integer,Integer> forMap: map.entrySet()){
            System.out.println(forMap.getKey() + " " + forMap.getValue());
        }
    }

    private static void forHashSet(int[] arr, HashSet<Integer> set) {
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("HashSet");
        for(Integer val : set){
            System.out.println(val);
        }

    }
}
