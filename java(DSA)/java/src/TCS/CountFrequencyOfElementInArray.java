package TCS;
import java.util.*;
public class CountFrequencyOfElementInArray {
    public static void main(String[] args) {
        int arr[] ={10,5,10,15,10,5};
        CountFrequency(arr);
    }

    private static void CountFrequency(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],  map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer>newmap : map.entrySet()){
            System.out.println(newmap.getKey() + " " + newmap.getValue());
        }
    }
}
