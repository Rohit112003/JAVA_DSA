package ust.twostack;

public class twoStacks {
    int start;
    int end;
    int arr[];

    twoStacks(int n) {
        start = 0;
        arr = new int[n];
        end = arr.length - 1;
    }

    public void push1(int val) {
        if (start <= end) {
            arr[start++] = val;
        } else {
            System.out.println("push1 stack is full");
        }
    }

    public void push2(int val) {
        if (start <= end) {
            arr[end--] = val;
        } else {
            System.out.println("push2 stack is full");
        }
    }

    public void pop1() {
        if (start > 0) {
            int val = arr[--start];
            System.out.println( val);
        } else {
            System.out.println("pop1 is empty");
        }
    }

    public void pop2() {
        if (end < arr.length - 1) {
            int val = arr[++end];
            System.out.println(val);
        } else {
            System.out.println("pop2 is empty");
        }
    }

    public void print() {
        System.out.print("Stack1: ");
        for (int i = 0; i < start; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("Stack2: ");
        for (int i = arr.length - 1; i > end; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
