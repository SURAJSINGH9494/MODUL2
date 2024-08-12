package surajapplication;

import java.util.Scanner;

public class ComputeValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        
        // Compute the values of nn and nnn
        String strN = Integer.toString(n);
        String nn = strN + strN;  // Concatenates the string representation of n twice
        String nnn = strN + strN + strN;  // Concatenates the string representation of n three times
        
        // Convert the strings back to integers
        int nnValue = Integer.parseInt(nn);
        int nnnValue = Integer.parseInt(nnn);
        
        // Compute the final result
        int result = n + nnValue + nnnValue;
        
        // Display the result
        System.out.println(n + " + " + nnValue + " + " + nnnValue + " = " + result);
        
        
    }
}
	