package TCS;

import java.util.Arrays;

public class RearrangeIncreaingDecresing {
    public static void main(String[] args) {
        int arr[] ={10,5,10,15,10,5,1,4};
        rearrange(0, arr.length/2, arr);
        redesc(arr.length/2+1, arr.length-1, arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void redesc(int start, int end, int[] arr) {
        while(start<end){
            int temp = arr[start];
            arr[start]  =arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    private static void rearrange(int start, int end, int[] arr) {
        while(start<end){
            int temp = arr[start];
            arr[start]  =arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
