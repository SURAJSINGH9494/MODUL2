package surajapplication;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayListsExample {
    public static void main(String[] args) {
        // Create the first ArrayList to store colors
        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");
        list1.add("Yellow");

        // Create the second ArrayList to store colors
        List<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Blue");
        list2.add("Yellow");

        // Compare the two ArrayLists
        boolean areEqual = list1.equals(list2);

        // Print the result
        if (areEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }

        // Compare two ArrayLists element by element
        List<String> comparisonResult = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            comparisonResult.add(list1.get(i).equals(list2.get(i)) ? "Yes" : "No");
        }

        // Print the element-by-element comparison result
        System.out.println("Element-by-element comparison: " + comparisonResult);
    }
}
