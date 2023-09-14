package Assignment;

public class q1 {
    public static void main(String[] args) {
        int n = 13;
        Boolean ans = CheckPrime(n);
        System.out.println(ans);
    }



    private static Boolean CheckPrime(int n) {

        if(n==0 || n==1){
            return false;
        }
        for(int i =2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
