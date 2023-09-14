package Assignment;

public class factorial {
    public static void main(String[] args) {
        int n =5;
        int ans = fact(n);
        System.out.println(ans);
    }

    private static int fact(int n) {
        int ans = 1;
        for(int i = n;i>0;i--){
            ans = ans*i;

        }
        return ans;
    }


}
