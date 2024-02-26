package Maths;

import java.util.HashMap;
import java.util.Map;

public class UniqueHashMap {
    public static void main(String[] args) {
        int[] n = {2,2,3,4,3,4,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n.length;i++){
            if(map.containsKey(n[i])){
                map.put(n[i],map.get(n[i])+1);
            }else{
                map.put(n[i],1);
            }
        }
       for(Map.Entry<Integer,Integer> entry :map.entrySet() ){
           if(entry.getValue()==1){
               System.out.println(entry.getKey());
           }
       }

    }
}
