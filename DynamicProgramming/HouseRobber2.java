package DynamicProgramming;
import java.util.*;
public class HouseRobber2 {
    public static void main(String[] args) {
        int[] array = {2,3,2};
        int ans = rob(array);
    }

    public static int rob(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        int size = nums.length;
        int[] dp = new int[size];
        int[] dp2 = new int[size];
        for(int i =0; i<size; i++){
            dp[i] = -1;
            dp2[i] = -1;
        }

        if(size==1){
            return nums[size];
        }
        for(int i =0; i<size;i++){
            if(i!=0) temp.add(nums[i]);
            if(i!=size-1) temp2.add(nums[i]);
        }
        return Math.max(robber(temp,dp,size-2),robber(temp2,dp2,size-2));
    }


    public static int robber(ArrayList<Integer> temp, int[] dp , int n){
        if(n==0){
            return temp.get(n);
        }
        if(n==-1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick = temp.get(n) + robber(temp,dp, n-2);
        int nonPick = 0 + robber(temp,dp,n-1);

        return dp[n] = Math.max(pick,nonPick);
    }
}
