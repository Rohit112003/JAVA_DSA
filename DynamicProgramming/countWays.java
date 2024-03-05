package DynamicProgramming;

public class countWays {
    public static void main(String[] args) {
        int n =5;
        int dp[] = new int[n+1];
        for (int i=0;i<=n;i++){
            dp[i]=-1;
        }
        int ans = climbStairs(n,dp);
        System.out.println(ans);

    }

    private static int climbStairs(int n, int[] dp) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        return dp[n]=climbStairs(n-1,dp) + climbStairs(n-2,dp);
    }
}
