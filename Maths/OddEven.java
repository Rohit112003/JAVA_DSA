package Maths;

public class OddEven {
    public static void main(String[] args) {
        int n = 64;
        boolean ans = check(n);
        System.out.println(ans);
    }

    private static boolean check(int n) {
        return ((n&1)==1);
    }
}
