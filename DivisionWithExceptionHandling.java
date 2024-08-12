package surajapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter two numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            
            // Perform division
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle arithmetic exception (e.g., division by zero)
            System.out.println("Exception: Cannot divide by zero!");
        } catch (InputMismatchException e) {
            // Handle input mismatch exception if non-integer inputs are provided
            System.out.println("Exception: Please enter valid integers!");
        } finally {
            
          
        }
    }
}


	