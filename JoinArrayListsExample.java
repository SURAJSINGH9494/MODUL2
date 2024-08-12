package surajapplication;

import java.util.ArrayList;

public class JoinArrayListsExample {
    public static void main(String[] args) {
        // Create the first ArrayList to store colors
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        // Create the second ArrayList to store more colors
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Purple");
        list2.add("Orange");

        // Print the original lists
        System.out.println("First ArrayList: " + list1);
        System.out.println("Second ArrayList: " + list2);

        // Join the two ArrayLists
        list1.addAll(list2);

        // Print out the joined list
        System.out.println("Joined ArrayList: " + list1);
    }
}
