package CswClass;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target= 4;
        int start = 0;
        int end = arr.length-1;

        int ans =  binaryS(start, end,arr, target);
        System.out.println(ans);
    }

    private static int binaryS(int start, int end, int[] arr, int target) {

            if(start>= end){
                return -1;

            }
            int mid = (start + (end - start)/ 2);
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                return binaryS(mid + 1, end, arr, target);

            } else {
                return binaryS(start, end - 1, arr, target);
            }
    }


}
