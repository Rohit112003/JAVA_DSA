package Array;

public class removeZeros {
    public static void main(String[] args) {
        int array[] = {0,1,0,3,12};
        moveZeroes(array);
    }
    public static void moveZeroes(int[] nums) {
        int array[] = new int[nums.length];
        int k = nums.length-1;
        for(int i=0;i<nums.length; i++){
            if(nums[i]==0){
                array[k] = nums[i];
                k--;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                array[i] = nums[i];
            }
        }
        for(int i =0; i<nums.length;i++){
            nums[i]=array[i];
        }
    }
}
