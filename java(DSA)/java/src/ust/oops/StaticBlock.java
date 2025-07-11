package ust.oops;

public class StaticBlock {
    static  int a=5;
    static  int b ;

    static {
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock st = new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(b);
    }
}
