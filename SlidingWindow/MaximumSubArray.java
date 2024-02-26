package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,7};
        int[] nums2 = {-2,1,-3,4,-1,2,1,-5,4};
        int k = 3;
        int ans = MaxSubArray(nums, k);
        System.out.println(ans);
//        ArrayList<Integer> list   = NegativeInteger(nums2 , k);
//        System.out.println(list);

    }

    private static ArrayList<Integer> NegativeInteger(int[] nums2, int k) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list= new ArrayList<>();
        int i = 0;
        int j =0;
        while(j< nums2.length){
            if(nums2[j]<0){
                queue.offer(nums2[j]);
                j++;
            }else if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(queue.size()==0){
                    list.add(0);

                }else{
                    list.add(queue.peek());
                    if(nums2[i]== queue.peek()){
                        queue.poll();
                    }

                }

                i++;
                j++;
            }
        }
        return list;

    }

    private static int MaxSubArray(int[] nums, int k) {
        int i = 0;
        int j =0 ;
        int Maxsum = 0;
        int sum= 0;
        while(j<nums.length){

            sum = sum+ nums[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1 == k){
                Maxsum = Math.max(Maxsum, sum);
                sum  =  sum - nums[i];
                i++;
                j++;
            }

        }
        return Maxsum;
    }
}
