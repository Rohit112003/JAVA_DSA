package DynamicProgramming;

public class Houserobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int ans = rob(nums);
        System.out.println(ans);
    }
    public static int rob(int[] nums) {
        int size = nums.length;
        int[] Dp = new int[nums.length+1];
        for(int i =0; i<=nums.length; i++){
            Dp[i] = -1;
        }
        int ans = functionRobber(size-1,Dp,nums);
        return ans;

    }
    public static int functionRobber(int n , int[] Dp,int[] nums){
        if(n==0){
            return nums[n];
        }
        if(n<0){
            return 0;
        }
        if(Dp[n]!=-1){
            return Dp[n];
        }
        int pick= nums[n]+ functionRobber(n-2,Dp,nums);
        int nonPick = 0+ functionRobber(n-1,Dp,nums);

        return Dp[n] = Math.max(pick,nonPick);
    }
}
