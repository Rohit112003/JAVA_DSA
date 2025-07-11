package TCS;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(searchElement(arr,target));
    }

    private static int searchElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=end-1;
            }else{
                start =mid+1;
            }
        }
        return 0;
    }
}
