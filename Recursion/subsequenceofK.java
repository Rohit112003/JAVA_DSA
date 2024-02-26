package Recursion;

import java.util.ArrayList;

public class subsequenceofK {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5};
        int k = 5;
        ArrayList<Integer> list = new ArrayList<>();
        checkSequnce(arr,0,k,list);
    }

    private static void checkSequnce(int[] arr, int i, int k, ArrayList<Integer> list) {
        if(i>=arr.length){
            if(k==0){
                System.out.println(list);
                return;
            }
            return;
        }
        if(k<0){
            return;
        }
        list.add(arr[i]);
        checkSequnce(arr,i+1,k-arr[i],list);
        list.remove(list.size()-1);
        checkSequnce(arr,i+1,k,list);

    }
}
