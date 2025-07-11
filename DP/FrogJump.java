package DP;

import java.lang.management.MemoryType;

public class FrogJump {
    public static void main(String[] args) {
        int n = 4;
        int array[] = {10, 20, 30, 40};
        int dp[] = new int[array.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int ans = frogMinimumAnsMemo(array, array.length - 1, dp);
        int ans1 = frogMinimumAnsTabo(array, array.length - 1, dp);
        int ans2 = frogMinimumAnsSpaceOpt(array, array.length - 1, dp);
        System.out.println(ans2);
        System.out.println(ans);
    }

    private static int frogMinimumAnsSpaceOpt(int[] array, int n, int[] dp) {
       int prev = 0;
       int prev2 = 0;
        for(int i =1; i<array.length; i++){
            int left = prev +Math.abs(array[i] -array[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1){
                right = prev2+ Math.abs(array[i]-array[i-2]);
            }
            int curr = Math.min(left,right);
            prev2 = prev;
            prev=  curr;
        }
        return prev;
    }

    private static int frogMinimumAnsTabo(int[] array, int n, int[] dp) {
        dp[0] = 0;
        for(int i =1; i<array.length; i++){
            int left = dp[i-1] +Math.abs(array[i] -array[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1){
                right = dp[i-2]+ Math.abs(array[i]-array[i-2]);
            }
            dp[i] = Math.min(left,right);
        }
        return dp[n];
    }

    private static int frogMinimumAnsMemo(int[] array, int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int firstJump = frogMinimumAnsMemo(array, n - 1, dp) + Math.abs(array[n] - array[n - 1]);
        int secondJump = Integer.MAX_VALUE;
        if (n > 1) {
            secondJump = frogMinimumAnsMemo(array, n - 2, dp) + Math.abs(array[n] - array[n - 2]);
        }
        dp[n] = Math.min(firstJump, secondJump);
        return dp[n];
    }
}
