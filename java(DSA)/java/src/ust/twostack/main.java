package ust.twostack;

public class main {
    public static void main(String[] args) {
        twoStacks stack = new twoStacks(20);
        stack.push1(6);
        stack.push1(7);
        stack.push1(8);
        stack.push1(9);
        stack.push1(1);
        stack.push2(5);
        stack.push2(4);
        stack.push2(3);
        stack.push2(2);
        stack.push2(10);
        stack.print();
        stack.pop1();
        stack.pop2();
        stack.print();


    }
}
