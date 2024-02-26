package DynamicProgramming;

import java.util.Arrays;

public class SubsetSum {
    public static void main(String[] args) {
        int[] array = {2,3,6,3};
        int k =4;
       boolean ans =  subset(array.length,array,k);
        System.out.println(ans);
    }

    private static boolean subset(int n ,int[] array, int k) {
        int dp[][]=new int[n][k+1];
        for(int row[]: dp)
            Arrays.fill(row,-1);
        return subsetSumUtil(n-1,k,array,dp);
    }

    private static boolean subsetSumUtil(int i, int target, int[] array, int[][] dp) {
        if(target==0){
            return true;
        }if(i==0){
           return array[0]==target;
        }   
        if(dp[i][target]!=-1){
            return dp[i][target]==0?false:true;
        }
        boolean take  = false;
        if(target>array[i]){
            take = subsetSumUtil(i-1,target-array[i],array,dp);
        }
        boolean notake = subsetSumUtil(i-1,target,array,dp);
        dp[i][target] = notake||take?1:0;
        return take|| notake ;


    }
}
