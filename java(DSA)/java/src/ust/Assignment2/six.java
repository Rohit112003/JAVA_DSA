package ust.Assignment2;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(primeCheck(n));
    }
    public static  boolean primeCheck(int n){
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
