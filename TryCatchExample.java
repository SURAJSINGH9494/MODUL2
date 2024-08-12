package surajapplication;

public class TryCatchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Try block to catch potential exceptions
        try {
            // This line may cause an ArrayIndexOutOfBoundsException
            System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block to handle the exception
            System.out.println("Exception caught: Array index is out of bounds!");
            System.out.println("Exception message: " + e.getMessage());
        }
        
        // Continue with other code
        System.out.println("Program continues after exception handling.");
    }
}

