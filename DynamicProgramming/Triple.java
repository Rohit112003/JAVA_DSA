package DynamicProgramming;

public class Triple {
    public static void main(String[] args) {
        int n = 4;
        tribonacci(n);
    }
    public static int tribonacci(int n) {
        int[] Dp = new int[n+1];
        for(int i =0; i<=n ;i++){
            Dp[i] = -1;
        }
        return fibo(n,Dp);
    }
    public static int fibo(int n, int[] dp){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = fibo(n-1,dp)+fibo(n-2,dp)+ fibo(n-3,dp);
    }
}
