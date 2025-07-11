package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int target = 10;
        FirstAndLast(arr, target);
    }

    private static void FirstAndLast(int[] arr, int target) {
        int[] ans = {-1, -1};
        int lowerBound = LowerBoundFind(arr, target);
        int upperBound = UpperBoundFind(arr, target);

        if (lowerBound != arr.length && arr[lowerBound] == target) {
            ans[0] = lowerBound;
            ans[1] = upperBound;
        }

        System.out.println(Arrays.toString(ans));
    }

    private static int LowerBoundFind(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                end = mid - 1;
                ans = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static int UpperBoundFind(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
