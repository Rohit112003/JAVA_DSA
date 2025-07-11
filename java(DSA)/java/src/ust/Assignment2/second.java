package ust.Assignment2;

public class second {
    public static void main(String[] args) {
        int n =10;
        int sum = 0;
        int sum2  =0;
        for(int i =1; i<=n ;i++){
            sum+=i;
        }
        System.out.println("sum of n numbers " + sum);

        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                sum2+=i;

            }

        }
        System.out.println("sum of n divisors "+ sum2);
    }
}
