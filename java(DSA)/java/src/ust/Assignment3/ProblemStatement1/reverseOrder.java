package ust.Assignment3.ProblemStatement1;

import java.util.Arrays;

public class reverseOrder {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
