package ust.BaseAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrcreation(sc);

    }
    public static void arrcreation(Scanner sc){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
    }

}
