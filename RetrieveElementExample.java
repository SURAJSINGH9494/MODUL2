package surajapplication;

import java.util.ArrayList;

public class RetrieveElementExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Specify the index from which to retrieve the element
        int index = 2;

        // Retrieve the element at the specified index
        String color = colors.get(index);

        // Print out the retrieved element
        System.out.println("Element at index " + index + ": " + color);
    }
}
