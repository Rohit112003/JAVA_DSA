package TCS;

public class GCD {
    public static void main(String[] args) {
        int a = 9;
        int b = 12;
        int ans = findGcd(a,b);
        System.out.println(ans);
    }

    private static int findGcd(int a, int b) {
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b =b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
}
