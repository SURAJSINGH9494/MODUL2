package surajapplication;

import java.util.HashMap;

public class HashMapSizeExample {
    public static void main(String[] args) {
        // Create a new HashMap to store key-value pairs
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add some key-value pairs to the HashMap
        capitalCities.put("USA", "Washington, D.C.");
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("Australia", "Canberra");

        // Get the number of key-value mappings in the HashMap
        int size = capitalCities.size();

        // Print the number of key-value mappings
        System.out.println("Number of key-value mappings in the HashMap: " + size);
    }
}
