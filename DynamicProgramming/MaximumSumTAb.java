package DynamicProgramming;

public class MaximumSumTAb {
    public static void main(String[] args) {
        int arr[] = {2,1,4,9};
        int dp[] = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            dp[i]=-1;
        }
        int ans  = sumAdjascentTab(arr,dp,arr.length);
        System.out.println(ans);
    }

    private static int sumAdjascentTab(int[] arr, int[] dp, int i) {

       dp[0] = arr[0];
       int neg = 0;
       for(int j=1; j<i; j++){
           int pick = arr[j] ;
           if(j>1){
               pick+=dp[j-2];
           }
           int notPick = dp[j-1];

           dp[j] = Math.max(pick,notPick);
       }
       return dp[i-1];
    }
}
