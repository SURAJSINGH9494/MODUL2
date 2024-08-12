package surajapplication;

import java.util.HashMap;
import java.util.Map;

public class CheckMapEmptyExample {
    public static void main(String[] args) {
        // Create a new HashMap to store key-value pairs
        Map<String, String> capitalCities = new HashMap<>();

        // Check if the map is empty
        if (capitalCities.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }

        // Add some key-value pairs to the map
        capitalCities.put("USA", "Washington, D.C.");
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");

        // Check again if the map is empty
        if (capitalCities.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }
    }
}

