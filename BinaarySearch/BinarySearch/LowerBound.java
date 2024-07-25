package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int arr[]={ 2,5,6,9,10,12,14};
        System.out.println( LowerBoundFInd(arr,11));
    }

    private static int LowerBoundFInd(int[] arr, int target) {
        int start = 0;
        int ans = arr.length;
        int high = arr.length-1;
        while(start<=high){
            int mid = (start+high)/2;
            if(arr[mid]>=target){
                high = mid-1;
                ans = mid;
            } else if (arr[mid]<target) {
                start = mid+1;
            }
        }
        return ans;
    }
}
