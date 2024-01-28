import java.util.*;

public class combination {
    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr); // Sort the array to handle duplicates
        checkCombination(arr, 0, target, list, ans);
        List<List<Integer>> uniqueList = removeDuplicates(ans);
        System.out.println(uniqueList);
    }

    private static void checkCombination(int[] arr, int i, int target, List<Integer> list, List<List<Integer>> ans) {
        if (i >= arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list)); // Create a new list to hold the combination
                return;
            }
            return;
        }
        if (target < 0) {
            return;
        }
        list.add(arr[i]);
        checkCombination(arr, i + 1, target - arr[i], list, ans);
        list.remove(list.size() - 1);
        checkCombination(arr, i + 1, target, list, ans);
    }
    public static List<List<Integer>> removeDuplicates(List<List<Integer>> list) {
        Set<List<Integer>> set = new HashSet<>();

        for (List<Integer> innerList : list) {
            set.add(new ArrayList<>(innerList));
        }

        return new ArrayList<>(set);
    }
}
