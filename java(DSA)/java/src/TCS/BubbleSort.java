package TCS;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {13, 46, 24, 52, 20, 9};
        sortNumbers(array);

     }

    private static void sortNumbers(int[] array) {
        for(int i =0; i<array.length-1;i++){
            for(int j =0;j<array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
