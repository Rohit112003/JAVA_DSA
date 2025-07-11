package Array;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] array  = {2,3,1,2,4,3};
        int target = 7;
        int ans = minSubArrayLen( target,array);
        System.out.println(ans);
    }


        public static int minSubArrayLen(int target, int[] nums) {
            int i = 0;
            int j = 0;
            int sum = 0;
            int min = Integer.MAX_VALUE;

            while (j < nums.length) {
                sum += nums[j];

                while (sum >= target) {
                    min = Math.min(j - i + 1, min);
                    sum -= nums[i];
                    i++;
                }

                j++;
            }

            return min == Integer.MAX_VALUE ? 0 : min;
        }


}
