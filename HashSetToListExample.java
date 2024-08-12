package surajapplication;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class HashSetToListExample {
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

        // Convert the HashSet to an ArrayList
        List<String> colorsList = new ArrayList<>(colors);

        // Print the ArrayList
        System.out.println("ArrayList: " + colorsList);
    }
}
