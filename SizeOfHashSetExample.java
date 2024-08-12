package surajapplication;

import java.util.HashSet;

public class SizeOfHashSetExample {
    public static void main(String[] args) {
        // Create a new HashSet to store colors
        HashSet<String> colors = new HashSet<>();

        // Add some colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Get the number of elements in the HashSet
        int size = colors.size();

        // Print the number of elements
        System.out.println("Number of elements in the HashSet: " + size);
    }
}
