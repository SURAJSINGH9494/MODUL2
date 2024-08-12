package surajapplication;

public class CommandLineDivision {
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

        try {
            // Parse command line arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Perform division
            int result = num1 / num2;

            // Print the result
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Exception: Cannot divide by zero!");
        } catch (NumberFormatException e) {
            // Handle invalid number format exception
            System.out.println("Exception: Please provide valid integers!");
        } finally {
            // Optional block to execute code regardless of exception occurrence
            System.out.println("End of program.");
        }
    }
}

