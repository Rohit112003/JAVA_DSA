package DynamicProgramming;

public class frogJumpTab {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int dp[] = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            dp[i]=-1;
        }
        int ans = frog(arr,dp,arr.length);
        System.out.println(ans);
    }

    private static int frog(int[] arr, int[] dp, int n) {
        dp[0] = 0;
        for(int i=1;i<n;i++){
            int fs = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1){
                ss = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            }
            dp[i] = Math.min(fs, ss);
        }
        return dp[n-1];
    }
}
