package BinarySearch;

public class BinarySearchbase {
    public static void main(String[] args) {
        int arr[]={ 2,5,6,9,10,12,14};
        System.out.println(BinarySearchOutputValIterative(arr,9));
        System.out.println(BinarySearchOutputValrecursion(arr,6,0,arr.length-1));
    }

    private static int BinarySearchOutputValIterative(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end=mid-1;
            }else{
                start= mid+1;
            }
        }
        return -1;
    }

    private static int BinarySearchOutputValrecursion(int[] arr,int target, int start, int end) {
        if(start>end){
            return -1;
        }
       int mid = (start+end)/2;
       if(arr[mid]==target){
           return mid;
       } else if (arr[mid]>target) {
           return BinarySearchOutputValrecursion(arr, target,start,mid-1);
       }else
         return   BinarySearchOutputValrecursion(arr, target,mid+1,end);
    }
}
