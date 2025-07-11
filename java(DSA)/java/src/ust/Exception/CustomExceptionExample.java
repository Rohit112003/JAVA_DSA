package ust.Exception;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        int userInput = -5;
        try {
            validateInput(userInput);
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    private static void validateInput(int input) throws CustomException {
        if (input < 0) {
            throw new CustomException("Input cannot be negative");
        }
    }
}

