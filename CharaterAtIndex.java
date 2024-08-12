package surajapplication;

import java.util.Scanner;

public class CharaterAtIndex {
    public static void main(String[] args) {
        String originalString = "Tops Technologies!";
        
        // Display the original string
        System.out.println("Original String = " + originalString);
        
        // Prompt the user to enter an index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();
        
        // Check if the index is within the bounds of the string length
        if (index >= 0 && index < originalString.length()) {
            // Get the character at the given index
            char character = originalString.charAt(index);
            System.out.println("The character at position " + index + " is " + character);
        } else {
            System.out.println("Index out of bounds. Please enter an index between 0 and " + (originalString.length() - 1));
        }
        
        scanner.close();
    }
}
