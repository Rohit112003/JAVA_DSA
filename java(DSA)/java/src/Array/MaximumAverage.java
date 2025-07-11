package Array;

public class MaximumAverage {
    public static void main(String[] args) {
        int array[] = {1,12,-5,-6,50,3};
        int k =4;
        findMaxAverage(array,k);
    }
    public static double findMaxAverage(int[] nums, int k) {
        int i =0;
        int j =0;
        double sum =0;
        double max = Double.MIN_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                double val = sum/k;
                max = Math.max(max, val);

            }else if(j-i+1>k){
                sum-=nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
