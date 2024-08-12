package surajapplication;

import java.util.ArrayList;

public class RemoveElementExample {
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

        // Remove the third element (index 2)
        colors.remove(2);

        // Print out the updated list
        System.out.println("Updated list of colors: " + colors);
    }
}
