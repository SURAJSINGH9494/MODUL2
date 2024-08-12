package surajapplication;

import java.util.ArrayList;

public class UpdateElementExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original list
        System.out.println("Original list of colors: " + colors);

        // Specify the index and the new element to update
        int index = 1;  // Index of the element to be updated
        String newColor = "Orange";  // New color to replace the old one

        // Update the element at the specified index
        colors.set(index, newColor);

        // Print out the updated list
        System.out.println("Updated list of colors: " + colors);
    }
}
