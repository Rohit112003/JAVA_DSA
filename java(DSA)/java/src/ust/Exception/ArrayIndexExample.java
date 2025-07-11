package ust.Exception;

public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            int result = accessArrayElement(numbers, 10);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index access: " + e.getMessage());
        }
    }

    private static int accessArrayElement(int[] array, int index) {
        return array[index];
    }
}
