package Assignment;

import java.util.ArrayList;

public class RemoveZerofromArray {
    public static void main(String[] args) {
        int[] array = {1,2,-3,3,1};
        removeZero(array);
    }

    private static void removeZero(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<array.length;i++){
            list.add(array[i]);
        }
        int sum =0;

        for(int i= 1; i<array.length;i++){
            int prev = array[i-1];
            if((prev-array[i])==0){
                list.remove(prev);
                list.remove(array[i]);
            }
        }
        System.out.println(list);
    }
}
