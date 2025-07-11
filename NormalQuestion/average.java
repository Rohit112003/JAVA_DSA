package NormalQuestion;

import java.util.*;
public class average {


    public static void main(String[] args) {
        int nums[] = {7, 8, 3, 4, 15, 13, 4, 1};
        double ans = minimumAverage(nums);
        System.out.println(ans);
    }

    public static double minimumAverage(int[] nums) {
        double min = Double.MAX_VALUE;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int val = nums[i];
            int val1 = nums[nums.length - 1 - i];
            double average = (val + val1) / 2.0;
            min = Math.min(average, min);
        }




        return min;


    }

}
