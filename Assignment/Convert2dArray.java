package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Convert2dArray {
    public static void main(String[] args) {
        int nums[] = {1,3,4,1,2,3,1};
        List<List<Integer>> ans=  findMatrix(nums);
        System.out.println(ans);
    }


    public static List<List<Integer>> findMatrix(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        int k = 0;
        List<List<Integer>> ans = new ArrayList<>();

        while (k < nums.length) {
            if (list.isEmpty()) {
                return ans;
            }

            ArrayList<Integer> newList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (newList.isEmpty() || !newList.contains(list.get(i))) {
                    newList.add(list.get(i));
                    list.remove(list.get(i));   

                }
            }

            ans.add(new ArrayList<>(newList));
            k++;
        }

        return ans;
    }

}
