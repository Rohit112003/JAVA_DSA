package Assignment;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RerangeArray {
    public static void main(String[] args) {
        int[] array= {3,1,-2,-5,2,-4};
        System.out.println( rearrangeArray(array));;
    }
    public static String rearrangeArray(int[] nums) {
        int array[] = new int[nums.length];
        Queue<Integer> qn = new LinkedList<>();
        Queue<Integer> qp = new LinkedList<>();
        for(int i = 0;i<nums.length; i++){
            if(nums[i]<0){
                qn.offer(nums[i]);
            }
        }
        for(int i = 0;i<nums.length; i++){
            if(nums[i]>0){
                qp.offer(nums[i]);
            }
        }
        for(int j =0; j<nums.length;j++){
            if(j%2==0){
                array[j]=qp.poll();
            }else{
                array[j]=qn.poll();
            }
        }

        return Arrays.toString(array);
    }
}
