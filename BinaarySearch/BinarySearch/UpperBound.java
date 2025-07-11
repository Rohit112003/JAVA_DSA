package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int arr[]={ 2,5,6,9,10,12,14};
        System.out.println( HigheBoundFInd(arr,11));
    }

    private static int HigheBoundFInd(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<=target){
                start = mid+1;
                ans = mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }
        }
        return arr[ans];
    }
}
