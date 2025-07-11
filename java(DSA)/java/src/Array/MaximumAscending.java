package Array;

public class MaximumAscending {
    public static void main(String[] args) {
        int nums[]= {10,20,30,5,10,50};
        System.out.println( maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        int sum =0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                max = Math.max(sum, max);
                sum=0;
            }
            sum+=nums[i-1];
        }



        return max;
    }
}
