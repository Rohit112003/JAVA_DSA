package CswClass;

public class pallindrome {
    public static void main(String[] args) {
        int x  = 121;
        boolean ans = isPalindrome(x);
        System.out.println(ans);
    }

    public static boolean isPalindrome(int x) {
        int sum= 0;
        int y = x;
        while(y>0){
            int m = y%10;
            sum = sum*10 +m;
            y = y/10;
        }
        if(sum==x){
            return true;
        }
        return false;
    }
}
