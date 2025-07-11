package Array;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int newArray[] = new int[m+n];
        int k =0;
        int i =0;
        int j =0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                newArray[k]=nums1[i];
                i++;
                k++;
            }if(nums1[i]>nums2[j]){
                newArray[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            newArray[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            newArray[k] = nums2[j];
            j++;
            k++;
        }
        for(int l=0; l<newArray.length; l++){
            nums1[l]= newArray[l];
        }
    }
}
