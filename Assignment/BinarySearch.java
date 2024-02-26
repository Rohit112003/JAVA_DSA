package Assignment;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;

        int start = 0;
        int end = arr.length-1;
        System.out.println(search(arr,target,start,end));
    }

    private static int search(int[] arr, int target,int start, int end) {

        int mid = (start + end)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target){
            return mid; 
        }else if(arr[mid]<target){
            return search(arr, target,mid+1,end);
        }else
            return search(arr,target,start,end-1);
    }
}
