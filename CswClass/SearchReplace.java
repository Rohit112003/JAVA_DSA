package CswClass;
import java.util.Arrays;
public class SearchReplace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int s = 0;
        int end= arr.length-1;
        replace(arr,3,7,s,end);
    }
    private static void replace(int[] arr, int i, int n,int s,int end) {
        int index = binaryS(s,end,arr,i);
        if(index!=-1){
            arr[index] = n;
        }
        System.out.println(Arrays.toString(arr));
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
