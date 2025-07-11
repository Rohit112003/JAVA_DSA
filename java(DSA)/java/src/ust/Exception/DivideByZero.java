package ust.Exception;

public class DivideByZero {
    public static void main(String[] args) {
        int num = 10;
        int den = 0;
        int result;

        try {
            result = division(num, den);
            System.out.println( result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }

    private static int division(int num, int den) {
        return num / den;
    }
}
