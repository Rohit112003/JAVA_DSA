package BinarySearch;

public class MinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {7,8,1,2,3,4,5,6};
        System.out.println(MinimumSorted(arr));
    }

    private static int MinimumSorted(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[mid]){
                ans = Math.min(arr[low],ans);
                low = mid+1;

            }
            else{
                ans = Math.min(arr[mid],ans);
                high = mid-1;
            }
        }
        return -1;
    }
}
