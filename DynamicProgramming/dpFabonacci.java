package DynamicProgramming;

import java.util.Arrays;

public class dpFabonacci {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n+1];
        for(int i =0;i<=n;i++){
            dp[i]=-1;

        }
        System.out.println(Arrays.toString(dp));
      int ans =   fibo4(n,dp);
        System.out.println(ans);
    }

    private static int fibo(int n) {
        if(n<=1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    private static int fibo2(int n, int[] dp){

        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
//        System.out.println(dp[n]);
        return dp[n] = fibo2(n-1,dp) + fibo2(n-2,dp);

    }
    //tabulation tc = o(n) sc = o(n)
    private static int fibo3(int n ,  int[] dp){
        dp[0] = 0;
        dp[1] =1;
        for(int i =2; i<=n;i++){
            dp[i]= dp[i-1]+ dp[i-2];
        }
        return dp[n];
    }
    //optimizing space complextiy o(1)
    private static int fibo4(int n , int[] dp){
        int prev2 =0;
        int prev =1;
        int curr= 0;

        for(int i =2; i<=n;i++){
            curr = prev+prev2;
            prev2 = prev;
            prev =curr;
        }
        return prev;
    }
}
