package surajapplication;

import java.util.ArrayList;

public class IncreaseArrayListSizeExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some initial colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print the original list and its size
        System.out.println("Original ArrayList: " + colors);
        System.out.println("Original size: " + colors.size());

        // Ensure the ArrayList can hold at least 10 elements
        colors.ensureCapacity(10);

        // Add more elements to increase the size
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Orange");

        // Print the updated list and its size
        System.out.println("Updated ArrayList: " + colors);
        System.out.println("Updated size: " + colors.size());
    }
}
