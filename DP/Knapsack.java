package DP;

public class Knapsack {
    public static void main(String[] args) {
        int wt[] = {1, 3, 4, 5};
        int val[] = {1, 4, 5, 7};
        int W = 7;
        int n = wt.length;
        int dp [][] = new int[wt.length+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]  = -1;
            }
        }
        Knapsack knapsack = new Knapsack();
        System.out.println(knapsack.knapsackans(wt, val, W, n,dp));
    }

    public int knapsackans(int wt[], int val[], int W, int n,int [][]dp) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }

        if (wt[n-1] > W) {
            return dp[n][W] =knapsackans(wt, val, W, n - 1,dp);
        } else {
            return dp[n][W] =  Math.max(val[n-1] + knapsackans(wt, val, W - wt[n-1], n - 1,dp),
                    knapsackans(wt, val, W, n - 1,dp));
        }
    }
}
