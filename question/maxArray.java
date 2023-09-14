public class maxArray {

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        int ans = findLHS(nums);
        System.out.println(ans);


    }

    public static int findLHS(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }

        }
        return max;
    }
}
