package NormalQuestion;

public class largestNumberSmalllerthanTarget {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 10;
        int result = findLargestSmallerThanTarget(sortedArray, target);
        System.out.println(result);
    }

    private static int findLargestSmallerThanTarget(int[] sortedArray, int target) {
        int start =0;
        int end = sortedArray.length-1;
        int candidate = 0;
        while(start<end){
            int mid = (start+end)/2;
            if(sortedArray[mid]<target){
                candidate = sortedArray[mid];
                start = mid+1;
            }else{
                end = end-1;
            }
        }
        return candidate;

    }
}
