package TCS;

public class prime {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(checkprime(n));
    }

    private static boolean checkprime(int n) {
        for(int i =2; i<n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
