package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class subsetSum2 {
    public static void main(String[] args) {
        int nums[] = {1,2,2};
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<ArrayList<Integer>> anslist = new ArrayList<>();
        sunSequence(0,nums,list,anslist);
        System.out.println(anslist.toString());
    }

    private static void sunSequence(int i, int[] nums, ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> anslist) {
        anslist.add(new ArrayList<>(ds));
        for(int k = i ;k<nums.length;k++ ){
            if(k!=i && nums[k]==nums[k-1]){
                continue;
            }
            ds.add(nums[i]);

            sunSequence(i+1,nums,ds,anslist);
            ds.remove(ds.size()-1);



        }

    }
}
