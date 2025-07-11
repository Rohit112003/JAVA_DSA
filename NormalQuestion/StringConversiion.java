package NormalQuestion;

import java.util.*;

public class StringConversiion {
    public static void main(String[] args) {

        int arr[]= {8,9,4,0,2,1,3,5,7,6};
        int nums[]= {991,338,38};
        sortJumbled(arr,nums);
    }
    public static void sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        String str="";
        for(int i =0; i<nums.length;i++){
            str+=nums[i];
            int val = 0;
            for(int j =0; j<str.length();j++){
                int number = Integer.parseInt(String.valueOf(str.charAt(j)));
                val = mapping[number]+ val*10;
            }
            map.put(nums[i],val);

//            list.add(val);
            str="";
            val=0;


        }
       for(Map.Entry<Integer,Integer> traverse: map.entrySet()){
           list.add(traverse.getKey());

       }
//        Collections.sort(list);
        System.out.println(list);
       int arr[] = new int[list.size()];
       for(int i =0 ; i<list.size();i++){
           arr[i] = list.get(i);
       }
        System.out.println(Arrays.toString(arr));


    }
}
