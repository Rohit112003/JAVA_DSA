package DP;

import java.util.Arrays;

public class NinjaTraining {
    public static void main(String[] args) {
        NinjaTraining nt = new NinjaTraining();


        int day = 3;
        int last = 0;
        int[][] points = {
                {1, 2, 5},
                {3, 1, 1},
                {3, 3, 3},
                {1, 5, 1}
        };
        int[][] dp = new int[day + 1][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
//        int result = nt.Training(day, last, points, dp);
        int results = nt.TrainingTabo(day, points,dp);
        System.out.println("Maximum points: " + results);
        nt.printDPArray(dp);

    }

    public int Training(int day, int last, int[][] points, int[][] dp) {
        if (day == 0) {
            int max = 0;
            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    max = Math.max(max, points[0][task]);
                }
            }
            return max;
        }
        if (dp[day][last] != -1) {
            return dp[day][last];
        }
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (i != last) {
                int point = points[day][i] + Training(day - 1, i, points, dp);
                max = Math.max(point, max);
            }
        }
        return dp[day][last] = max;
    }

    public void printDPArray(int[][] dp) {
        System.out.println("DP Array:");
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int TrainingTabo(int days, int[][] points,int [][]dp) {
//        int[][] dp = new int[days + 1][4];

        // Base case: Day 0
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        // Fill the dp array
        for (int day = 1; day <= days; day++) {
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {
                        int point = points[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(dp[day][last], point);
                    }
                }
            }
        }
        return dp[days-1][3];
    }
}
