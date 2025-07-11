package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[]={7,8,9,1,2,3,4,5,6};
        int target = 1;
        int ans= RotatedSorted(arr,target);
        System.out.println(ans);
    }

    private static int RotatedSorted(int[] arr, int target) {
        int start= 0;
        int end = arr.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==target){
                return mid;
            } if(arr[start]<=arr[mid]){
                if(arr[start]<=target &&  target<=arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[mid]<=target &&  target<=arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return  -1;
    }
}
