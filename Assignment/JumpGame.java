package Assignment;
import java.util.*;
public class JumpGame {
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<nums.length;i++){
            q.offer(nums[i]);
        }
        while(!q.isEmpty()){
            int val= q.peek();
            int i =1;
            while(i<=val){
                q.poll();
                i++;
            }
            

        }
        return false;
    }
}
