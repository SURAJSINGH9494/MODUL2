package surajapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class MapValuesCollectionViewExample {
    public static void main(String[] args) {
        // Create a new HashMap to store key-value pairs
        Map<String, String> capitals = new HashMap<>();

        // Add some key-value pairs to the HashMap
        capitals.put("USA", "Washington, D.C.");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Japan", "Tokyo");

        // Print the original map
        System.out.println("Original Map: " + capitals);

        // Get a collection view of the values contained in the map
        Collection<String> values = capitals.values();

        // Print the collection view of values
        System.out.println("Collection view of values: " + values);
    }
}
