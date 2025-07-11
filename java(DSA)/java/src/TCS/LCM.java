package TCS;

public class LCM {
    public static void main(String[] args) {
        int a =20;
        int b = 60;
        int ans = findLcm(a,b);
        System.out.println(ans);
    }

    private static int findLcm(int a, int b) {
        int gcd = 1;
        for(int  i=1; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        int lcm = (a*b)/gcd;
        return lcm;
    }
}
