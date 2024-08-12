package surajapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Find the second most frequent character
        char result = findSecondMostFrequentCharacter(input);
        
        if (result != '\0') {
            System.out.println("The second most frequent character in the string is: " + result);
        } else {
            System.out.println("There is no second most frequent character.");
        }
        
      
    }

    private static char findSecondMostFrequentCharacter(String str) {
        // Frequency map to count occurrences of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Fill the frequency map
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Priority queue to sort characters by frequency in descending order
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        
        // Add all entries to the priority queue
        maxHeap.addAll(frequencyMap.entrySet());
        
        // Find the second most frequent character
        int count = 0;
        char secondMostFrequentChar = '\0';
        
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            count++;
            
            // If this is the second unique frequency
            if (count == 2) {
                secondMostFrequentChar = entry.getKey();
                break;
            }
        }
        
        return secondMostFrequentChar;
    }
}
