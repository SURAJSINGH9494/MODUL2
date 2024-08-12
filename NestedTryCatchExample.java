package surajapplication;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            try {
                // Inner try block
                int[] a = new int[5];
                // Attempt to perform division by zero and assign the result to an invalid array index
                a[5] = 30 / 0;  // This will throw an ArithmeticException for division by zero
            } catch (ArithmeticException e) {
                // Handle division by zero exception
                System.out.println("Inner Exception: Division by zero is not allowed!");
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle array index out of bounds exception
                System.out.println("Inner Exception: Array index is out of bounds!");
            }
        } catch (Exception e) {
            // Handle any unexpected exceptions that were not caught by inner try-catch
            System.out.println("Outer Exception: An unexpected exception occurred: " + e.getMessage());
        } finally {
            // Optional block to execute code regardless of exception occurrence
            System.out.println("Finally block executed.");
        }
    }
}
