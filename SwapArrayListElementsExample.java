package surajapplication;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayListElementsExample {
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

        // Swap two elements in the ArrayList
        Collections.swap(colors, 1, 3); // Swap elements at index 1 and 3

        // Print out the list after swapping
        System.out.println("List of colors after swapping: " + colors);
    }
}
