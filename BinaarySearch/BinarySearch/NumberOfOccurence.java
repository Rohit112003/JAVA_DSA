package BinarySearch;
public class NumberOfOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        System.out.println(Occurence(arr,5));
    }

    private static int Occurence(int[] arr,int target) {
        int ans = -1;
        int val = first(arr,target);
        if(val==-1){

           return ans;
        }
        int val2 = last(arr,target);
        ans =(val2 - val)+1;
        return ans;

    }

    private static int first(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                ans = mid;
                end=mid-1;
            } else if (arr[mid]<target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;

    }

    private static int last(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                ans = mid;
                start=mid+1;
            } else if (arr[mid]<target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
}
