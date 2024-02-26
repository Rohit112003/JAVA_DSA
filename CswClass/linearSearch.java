package CswClass;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {5,4,2,8,9};
        int target= 8;
        int ans =  linear(arr, target);
        System.out.println(ans);
    }

    private static int linear(int[] arr, int target) {
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
