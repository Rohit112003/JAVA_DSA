import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        int[] nums ={-1,0,1,2,-1,-4};
        List<List<Integer>> ans  = threeSum(nums);
        System.out.println(ans);

    }
    public  static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 ||(i>0 && nums[i]!=nums[i-1])){
                int low=i+1;
                int hi=nums.length-1;
                int sum=0-nums[i];
                while(low<hi){
                    if(nums[low]+nums[hi]==sum){
                        ans.add(Arrays.asList(nums[i],nums[low],nums[hi]));
                        while(low<hi && (nums[low]==nums[low+1])){
                            low++;
                        }
                        while(low<hi && (nums[hi]==nums[hi-1])){
                            hi--;
                        }
                        low++;
                        hi--;
                    }
                    else if(nums[low]+nums[hi]<sum){
                        low++;
                    }
                    else{
                        hi--;
                    }
                }
            }
        }
        return ans;
    }
}
