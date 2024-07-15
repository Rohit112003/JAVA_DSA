package DP;

import java.util.Scanner;

public class fabonaciii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        for (int i = 0; i <=n; i++) {
            dp[i] = -1;
        }
       int ans =  fabonacmemoization(n,dp);
        int memoans = fabonactabulation(n,dp);
        System.out.println(memoans);
    }

    private static int fabonacmemoization(int n, int[] dp ) {
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = fabonacmemoization(n-1,dp)+ fabonacmemoization(n-2,dp);
    }

    private static int fabonactabulation(int n, int[] dp ) {
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <=n ; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
