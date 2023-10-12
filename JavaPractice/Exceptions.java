package JavaPractice;

public class Exceptions {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {

            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        if (num1 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

}