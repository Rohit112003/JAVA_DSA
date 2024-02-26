package SlidingWindow;

public class minSubArray {
    public static void main(String[] args) {
        int[] array = {2,3,1,2,4,3};
        int target = 7;
        int ans = minSubArrayLen(target,array);
        System.out.println(ans);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int i =0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(j<nums.length && i<nums.length){
            sum = sum+nums[j];

            if(sum<target){
                j++;
            }
            else if(sum==target){
                int size = j-i+1;
                min = Math.min(min,size);
                sum = sum-nums[i];
                i++;
                j++;
            } else if (sum>target) {
                sum= sum- nums[i];
                i++;
            }
        }
        return min;
    }
}
