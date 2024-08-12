package surajapplication;

import java.util.Scanner;

public class StringEndsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        // Prompt the user to enter the suffix string
        System.out.print("Enter the suffix string: ");
        String suffixString = scanner.nextLine();
        
        // Check if the main string ends with the suffix string
        boolean endsWith = mainString.endsWith(suffixString);
        
        // Display the result
        System.out.println("\"" + mainString + "\" ends with \"" + suffixString + "\"? " + endsWith);
        
    
    }
}

