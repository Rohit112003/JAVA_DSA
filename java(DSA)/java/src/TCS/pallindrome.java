package TCS;

public class pallindrome {
    public static void main(String[] args) {
        int n = 455;
        boolean ans = checkpallindrome(n);
        System.out.println(ans);
    }

    private static boolean checkpallindrome(int n) {
        int s = n;
        int sum = 0;
        while(s>0){
            int temp = s%10;
            sum = sum*10+ temp;
            s = s/10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
