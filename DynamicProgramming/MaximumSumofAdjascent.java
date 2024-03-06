package DynamicProgramming;

public class MaximumSumofAdjascent {
    public static void main(String[] args) {
        int arr[] = {2,1,4,9};
        int dp[] = new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            dp[i]=-1;
        }
        int ans  = sumAdjascent(arr,dp,arr.length-1);
        System.out.println(ans);
    }

    private static int sumAdjascent(int[] arr, int[] dp,int i) {
        if(i==0){
            return arr[i];
        }
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick = arr[i] + sumAdjascent(arr,dp ,i-2);
        int notPick = sumAdjascent(arr,dp,i-1);

        return dp[i] = Math.max(pick,notPick);
    }
}
