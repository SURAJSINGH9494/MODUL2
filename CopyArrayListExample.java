package surajapplication;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayListExample {
    public static void main(String[] args) {
        // Create the first ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the first ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Create the second ArrayList with the same size as the first
        ArrayList<String> colorsCopy = new ArrayList<>(colors.size());

        // Add null elements to the second ArrayList to match the size of the first list
        for (int i = 0; i < colors.size(); i++) {
            colorsCopy.add(null);
        }

        // Copy the contents of the first ArrayList into the second ArrayList
        Collections.copy(colorsCopy, colors);

        // Print out both the original and copied lists
        System.out.println("Original list of colors: " + colors);
        System.out.println("Copied list of colors: " + colorsCopy);
    }
}
