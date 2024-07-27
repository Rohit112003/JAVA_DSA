package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int start = 1;
        int high = nums.length-2;
        while(start<=high){
            int mid=(start+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }if(nums[mid-1]<nums[mid]){
                start = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;

    }
}
