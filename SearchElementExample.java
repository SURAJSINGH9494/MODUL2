package surajapplication;

import java.util.ArrayList;

public class SearchElementExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Specify the element to search for
        String searchColor = "Blue";

        // Search for the element in the ArrayList
        boolean found = colors.contains(searchColor);

        // Print out the result of the search
        if (found) {
            System.out.println(searchColor + " is found in the list at index: " + colors.indexOf(searchColor));
        } else {
            System.out.println(searchColor + " is not found in the list.");
        }
    }
}
