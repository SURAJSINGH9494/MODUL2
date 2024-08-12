package surajapplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringInterleavings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Set to store unique interleavings
        Set<String> interleavings = new HashSet<>();

        // Generate all interleavings
        generateInterleavings(str1, str2, "", interleavings);

        // Display the interleavings
        System.out.println("The interleaving strings are: " + interleavings);

        
    }

    // Recursive method to generate interleavings
    private static void generateInterleavings(String str1, String str2, String result, Set<String> interleavings) {
        // If both strings are empty, add the result to the set
        if (str1.isEmpty() && str2.isEmpty()) {
            interleavings.add(result);
            return;
        }

        // If str1 is not empty, add its first character and recurse
        if (!str1.isEmpty()) {
            generateInterleavings(str1.substring(1), str2, result + str1.charAt(0), interleavings);
        }

        // If str2 is not empty, add its first character and recurse
        if (!str2.isEmpty()) {
            generateInterleavings(str1, str2.substring(1), result + str2.charAt(0), interleavings);
        }
    }
}
