package surajapplication;

import java.util.HashSet;
import java.util.Set;

public class CompareSetsAndRetainCommonElements {
    public static void main(String[] args) {
        // Create the first HashSet
        Set<String> set1 = new HashSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");
        set1.add("Yellow");

        // Create the second HashSet
        Set<String> set2 = new HashSet<>();
        set2.add("Blue");
        set2.add("Yellow");
        set2.add("Purple");
        set2.add("Orange");

        // Print the original sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Retain only the elements that are common to both sets
        set1.retainAll(set2);

        // Print the common elements
        System.out.println("Common elements in both sets: " + set1);
    }
}
