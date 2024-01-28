package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {3,2,4,1,9,8};
        mergesorting(arr,0 ,arr.length);
    }

    private static void mergesorting(int[] arr, int low,  int high) {
        if(low>=high) return;
        int mid = (low+high)/2;
        mergesorting(arr,low,mid);
        mergesorting(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        int index = low;
        for (int num : list) {
            arr[index] = num;
            index++;
        }
        System.out.println(Arrays.toString(arr));


    }

}
