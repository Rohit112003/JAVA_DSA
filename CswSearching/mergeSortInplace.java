package CswSearching;

import java.util.Arrays;

public class mergeSortInplace {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        int n = arr.length;
        MergeSort(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void MergeSort(int[] arr, int start, int end) {
        if(end-start==1){
            return;
        }
        int mid = (start+end)/2;
        MergeSort(arr,0,mid);
        MergeSort(arr,mid,end);
        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix= new int[end-start];
        int i = start;
        int j = end;
        int k = 0;
        while(i<mid && j<end){
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }
}
