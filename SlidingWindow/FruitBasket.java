package SlidingWindow;
import java.util.Map;
import java.util.HashMap;

public class FruitBasket {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int ans = basket(arr);
        System.out.println(ans);
    }

    private static int basket(int[] arr) {
        int size = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        int j =0;
        int max = -1;
        int i = 0;
        int sum = 0;
        while(j<arr.length){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(map.size()<size){
                j++;
            }
            if(map.size()==size){
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    sum += entry.getValue();

                }
                max= Math.max(sum,max);
                sum=0;
                j++;
            }
            else if(map.size()>size){
                while(map.size()>size){
                    if(map.get(arr[i])>0){
                        map.put(arr[i],map.get(arr[i])-1);
                        if(map.get(arr[i])==0){
                            map.remove(arr[i]);
                        }
                    }
                    i++;
                }
                j++;
            }

        }
        return max;

    }
}

