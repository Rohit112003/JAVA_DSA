package DynamicProgramming;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int dp[] = new int[arr.length+1];
        for (int i=0;i<=arr.length;i++){
            dp[i]=-1;
        }
        int ans = frog(arr,dp,arr.length-1);
        System.out.println(ans);
    }

    private static int frog(int[] arr, int[] dp,int n) {
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int left = frog(arr,dp,n-1) + Math.abs(arr[n]- arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1){
            right= frog(arr,dp,n-2) + Math.abs(arr[n]-arr[n-2]);
        }
       return dp[n] = Math.min(left,right);
    }
}
