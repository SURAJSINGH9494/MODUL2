package surajapplication;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListExample {
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

        // Sort the ArrayList
        Collections.sort(colors);

        // Print out the sorted list
        System.out.println("Sorted list of colors: " + colors);
    }
}
