package slidingWindow;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        int k =4;
        System.out.println(findMaxAverage(nums,k));
        ;
    }
    public static double findMaxAverage(int[] nums, int k) {
        int i =0;
        int j =0;
        double max = Double.MIN_VALUE;
        double sum = 0;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                double val = sum/k;
                max = Math.max(val,max);
                sum -= nums[i];
                i++;
                j++;
            }

            }

        return max;


    }
}
