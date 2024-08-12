package surajapplication;

import java.util.HashSet;

public class HashSetToArrayExample {
    public static void main(String[] args) {
        // Create a new HashSet to store colors
        HashSet<String> colors = new HashSet<>();

        // Add some colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original HashSet
        System.out.println("Original HashSet: " + colors);

        // Convert the HashSet to an array
        String[] colorsArray = colors.toArray(new String[0]);

        // Print the array
        System.out.println("Array elements:");
        for (String color : colorsArray) {
            System.out.println(color);
        }
    }
}
