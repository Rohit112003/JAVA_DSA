package Assignment;

import java.util.Arrays;
import java.util.Stack;

public class RotateArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int rotated = 3;
        doWrotate(arr,rotated);

    }

    private static void doWrotate(int[] arr, int rotated) {
        Stack<Integer> st = new Stack<>();
        for (int i:arr) {
            st.add(i);
        }
        int n =0;
        int arr1[] = new int[8];
        int k =0;
        for(int i=0;i<arr.length;i++){
            if(k<rotated){
                arr1[n] = st.pop();
                k++;
                n++;
            }else{
                for(int j = 0; j<arr.length;j++){
                    if(n==arr.length){
                        break;
                    }else{
                        arr1[n] = arr[j];
                        n++;
                    }
                }

            }
        }
        System.out.println(Arrays.toString(arr1));

}
}