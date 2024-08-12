package surajapplication;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        
        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        
        // Concatenate the second string to the end of the first string
        String concatenatedString = firstString + secondString;
        
        // Display the concatenated string
        System.out.println("Concatenated String: " + concatenatedString);
        
       
    }
}
