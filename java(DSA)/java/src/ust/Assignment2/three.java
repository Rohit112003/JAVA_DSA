package ust.Assignment2;

public class three {
    public static void main(String[] args) {
        int a = 12;
        int b = 25;
        int c = 18;

        int greatest;

        if (a >= b && a >= c) {
            greatest = a;
        } else if (b >= a && b >= c) {
            greatest = b;
        } else {
            greatest = c;
        }

        System.out.println("Greatest number is: " + greatest);
    }
}
