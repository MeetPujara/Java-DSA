package Assignments.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_Items_Matching {
    static void main() {
        // 1. Setup sample data (The "items")
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        // 2. Define your rules
        String ruleKey = "type";
        String ruleValue = "phone";

        // 3. The Logic (Directly in main)
        int counter = 0;
        int indexToCheck = 0;

        // Determine which index to look at based on the key
        if (ruleKey.equals("type")) {
            indexToCheck = 0;
        } else if (ruleKey.equals("color")) {
            indexToCheck = 1;
        } else if (ruleKey.equals("name")) {
            indexToCheck = 2;
        }

        // Loop through the items and check the specific index
        for (List<String> item : items) {
            if (item.get(indexToCheck).equals(ruleValue)) {
                counter++;
            }
        }

        // 4. Print the result
        System.out.println("Match count: " + counter);
    }
}