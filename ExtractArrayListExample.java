package surajapplication;

import java.util.ArrayList;
import java.util.List;

public class ExtractArrayListExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Orange");

        // Print the original list
        System.out.println("Original list of colors: " + colors);

        // Extract a portion of the ArrayList (from index 1 to 4)
        List<String> subList = colors.subList(1, 4);

        // Print out the extracted portion of the list
        System.out.println("Extracted portion of the list: " + subList);
    }
}
