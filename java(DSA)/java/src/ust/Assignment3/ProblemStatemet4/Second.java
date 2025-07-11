package ust.Assignment3.ProblemStatemet4;

public class Second {
    public static void main(String[] args) {
        int arr[] = {5,4,6,7,3,6,3,8,9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println( sum/ arr.length);
    }
}
