package surajapplication;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSetExample {
    public static void main(String[] args) {
        // Create a new HashSet to store colors
        HashSet<String> colors = new HashSet<>();

        // Add some colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Iterating through the HashSet using an Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterating through the HashSet using a for-each loop
        System.out.println("\nUsing for-each loop:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Iterating through the HashSet using Java 8 forEach with a lambda expression
        System.out.println("\nUsing Java 8 forEach with lambda:");
        colors.forEach(color -> System.out.println(color));
    }
}
