package Array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val=3;
        System.out.println( removeElement(nums,val));

    }


    public static int removeElement(int[] nums, int val) {
        int array[] = new int[nums.length];
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                array[k] = nums[i];
                k++;
            }
        }
        for(int i =0; i<array.length;i++){
            nums[i]=array[i];
        }
        System.out.println(Arrays.toString(nums));
        return k;

    }
}
