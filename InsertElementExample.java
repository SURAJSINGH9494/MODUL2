package surajapplication;

import java.util.ArrayList;

public class InsertElementExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Insert a new color at the first position
        colors.add(0, "Red");

        // Print out the updated collection of colors
        System.out.println("Updated list of colors: " + colors);
    }
}

