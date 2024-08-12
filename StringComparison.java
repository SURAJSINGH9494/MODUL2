package surajapplication;


import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        
        // Prompt the user to enter the second string or character sequence
        System.out.print("Enter the second string (or character sequence): ");
        String secondString = scanner.nextLine();
        
        // Compare the two strings using equals() method
        boolean areEqual = firstString.equals(secondString);
        
        // Display the result of the comparison
        System.out.println("Comparing \"" + firstString + "\" and \"" + secondString + "\": " + areEqual);
        
     
    }
}
