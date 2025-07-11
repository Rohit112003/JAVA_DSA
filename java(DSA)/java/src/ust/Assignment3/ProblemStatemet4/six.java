package ust.Assignment3.ProblemStatemet4;

import java.util.HashMap;
import java.util.Map;

public class six {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        int arr[]= {1,1,2,3,4,4,2,3,6,4,5,5,6};
        for (int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map.size());
        for(Map.Entry<Integer,Integer> formap : map.entrySet()){
            System.out.println(formap.getKey() + " " + formap.getValue());
        }
    }
}
