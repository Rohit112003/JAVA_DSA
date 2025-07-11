package ust.Assignment3.ProblemStatement1;

import java.util.Arrays;

class NumberArray {
    int[] arr;

    public NumberArray(int[] arr) {
        this.arr = arr;
    }
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
    public void sortArray() {
        Arrays.sort(arr);
    }
}

class Main {
    public static void main(String[] args) {
        int[] data = {45, 12, 78, 3, 22};
        NumberArray obj = new NumberArray(data);

        System.out.println("Original : " + obj);

        obj.sortArray();

        System.out.println("Sorted : " + obj);
    }
}
