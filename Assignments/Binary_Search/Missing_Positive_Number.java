package Assignments.Binary_Search;

import java.util.HashSet;
import java.util.Set;

public class Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(kthMissing_Brute(arr, k)); // Output: 9
    }

    public static int kthMissing_Brute(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num); // Populate the set
        }

        int counter = 0;
        int current_val = 0;

        while (counter < k) {
            current_val++;
            if (!set.contains(current_val)) {
                counter++; // Only increment counter if missing
            }
        }
        return current_val;
    }
}