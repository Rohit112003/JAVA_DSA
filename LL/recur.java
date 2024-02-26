package LL;

public class recur {
    public static void main(String[] args) {
        int x = 3;
        fun(x);
    }

    private static void fun(int x) {
        if(x==0){
            return;
        }
        fun(x/3);
        fun(x/3);
        fun(x/3);
    }
}
