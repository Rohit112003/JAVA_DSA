package CswClass;

import java.util.*;

public class newStocks {
    public static void rePopulateStack(Stack<Integer> myStack, int nums[], int limit, int currElement) {
        for (int i = limit; i >= 0; i--) {
            if (nums[i] <= currElement) {
                myStack.push(nums[i]);
            } else {
                break;
            }
        }
        int count = 0;
        while(!myStack.isEmpty()){
            myStack.pop();
            count++;

        }
        System.out.println("span"+ currElement + "less than Stocks" + count);
    }

    public static void getSpan(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            rePopulateStack(new Stack<>(), nums, i, nums[i]);
        }
    }

    public static void main(String args[]) {
        int nums[] = { 50, 70, 99, 520, 70, 140 };
        getSpan(nums);
    }
}

