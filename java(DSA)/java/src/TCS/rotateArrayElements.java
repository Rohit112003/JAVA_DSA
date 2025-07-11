package TCS;

import java.util.Arrays;

public class rotateArrayElements {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        int  k =3;
        arrayReverse(0,arr.length-1,arr);
        arrayReverse(0,k-1,arr);
        arrayReverse(k,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void arrayReverse(int start, int end, int[] arr) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
