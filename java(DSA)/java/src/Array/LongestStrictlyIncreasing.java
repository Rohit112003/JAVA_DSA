package Array;

public class LongestStrictlyIncreasing {
    public static void main(String[] args) {
    int[]array = {2,1,12};
//    longestMonotonicSubarray(array);
        System.out.println(longestMonotonicSubarray(array));
    }
    public static int longestMonotonicSubarray(int[] nums) {
        int count=1;
        int seccount =1;
        int max= Integer.MIN_VALUE;
        int secMax= Integer.MIN_VALUE;
        for(int i=1;i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                count++;
                max = Math.max(max,count);
            }else{
                count=1;
            }
        }
        for(int i=1;i<nums.length; i++){
            if(nums[i-1]>nums[i]){
                seccount++;
                secMax = Math.max(secMax,seccount);
            }else{
                seccount=1;
            }
        }
        if(max==Integer.MIN_VALUE && secMax==Integer.MIN_VALUE) return 1;
        return Math.max(max,secMax);
    }
}
