package TCS;

public class LargestNumber {
    public static void main(String args[]){
        int array[] = {4,3,5,2,1,9};
        int ans = largest(array);
        System.out.println(ans);
    }

    private static int largest(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int i =0; i<array.length; i++){
            if(max<array[i]){
                max= array[i];
            }
        }
        return max;
    }
}
