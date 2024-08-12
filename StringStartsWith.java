package surajapplication;

import java.util.Scanner;

public class StringStartsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        // Prompt the user to enter the prefix string
        System.out.print("Enter the prefix string: ");
        String prefixString = scanner.nextLine();
        
        // Check if the main string starts with the prefix string
        boolean startsWith = mainString.startsWith(prefixString);
        
        // Display the result
        System.out.println("\"" + mainString + "\" starts with \"" + prefixString + "\"? " + startsWith);
        
            }
}
