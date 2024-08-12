package surajapplication;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap to store key-value pairs
        HashMap<String, String> capitalCities = new HashMap<>();

        // Associate specified values with specified keys
        capitalCities.put("USA", "Washington, D.C.");
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("Australia", "Canberra");

        // Print out the HashMap
        System.out.println("HashMap of capital cities: " + capitalCities);

        // Access a value using a specified key
        String country = "Germany";
        String capital = capitalCities.get(country);

        // Print the capital of the specified country
        System.out.println("The capital of " + country + " is " + capital);
    }
}
