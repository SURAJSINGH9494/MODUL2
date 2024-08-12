package surajapplication;

import java.util.HashSet;

public class AppendHashSetExample {
    public static void main(String[] args) {
        // Create a new HashSet to store colors
        HashSet<String> colors = new HashSet<>();

        // Add some colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print the original set
        System.out.println("Original HashSet of colors: " + colors);

        // Specify the element to be appended
        String newColor = "Yellow";

        // Append the specified element to the HashSet
        colors.add(newColor);

        // Print out the updated set
        System.out.println("Updated HashSet of colors: " + colors);
    }
}
