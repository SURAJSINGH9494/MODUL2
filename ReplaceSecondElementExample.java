package surajapplication;

import java.util.ArrayList;

public class ReplaceSecondElementExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // Specify the new element to replace the second element
        String newElement = "Purple";

        // Replace the second element (index 1) with the new element
        if (colors.size() > 1) {
            colors.set(1, newElement);
        } else {
            System.out.println("The ArrayList does not have a second element.");
        }

        // Print the ArrayList after replacement
        System.out.println("ArrayList after replacing the second element: " + colors);
    }
}
