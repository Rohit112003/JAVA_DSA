package Assignment;

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 64;
        boolean ans = checkTwo(n);
        System.out.println(ans);
    }

    private static boolean checkTwo(int n) {
        if(n==1){
            return true;
        }
        if(n%2!=0 || n==0){
            return false;
        }
         return checkTwo(n / 2);


    }
}
