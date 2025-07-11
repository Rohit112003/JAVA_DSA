package DP;

public class MaximumSumOFAdjascentElement {
    public static void main(String[] args) {
        int arr[] = {1,2};
        int dp[] = new int[arr.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
//       int ans =  maximumSumMEmo(arr, dp,arr.length-1 );
        int ans1 =  maximumSumTabo(arr, dp,arr.length-1 );
//        System.out.println(ans);
        System.out.println(ans1);
    }

    private static int maximumSumTabo(int[] arr, int[] dp, int n) {
        dp[0] = arr[0];

        for(int i = 1; i<arr.length; i+=2){
            int pick =  arr[i];
            if(i>1){
                pick+=dp[i-2];
            }
            int nontake = 0+ dp[i-1];
            dp[i] = Math.max(pick,nontake);
        }
        return dp[n];

    }

    private static int maximumSumMEmo(int[] arr, int[] dp, int n) {
        if(n==0){
            return arr[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick = arr[n];
        if(n>1){
            pick =    maximumSumMEmo(arr,dp , n-2);
        }

        int notpick = maximumSumMEmo(arr,dp,n-1);
        return dp[n] = Math.max(pick,notpick);
    }
}
