package surajapplication;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Iterating through the ArrayList using an Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterating through the ArrayList using a for-each loop
        System.out.println("\nUsing for-each loop:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Iterating through the ArrayList using a for loop with index
        System.out.println("\nUsing for loop with index:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
