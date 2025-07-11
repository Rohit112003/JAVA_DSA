package ust.Assignment3.ProblemStatement5;

public class second {
    public static void main(String[] args) {
        try {
            throwChecked();
        } catch (Exception e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }
    }

    static void throwChecked() throws Exception {
        throw new Exception("This is a checked exception");
    }
}
