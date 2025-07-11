package TCS;

public class SmallestNumberArray {
    public static void main(String[] args) {
        int array[] = {4,3,5,2,1,9};
        int ans = smallest(array);
        System.out.println(ans);
    }

    private static int smallest(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i =0; i<array.length; i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
}
