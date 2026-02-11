package Assignments.Array;

import java.util.ArrayList;

public class Unique_Integer_Sum_0 {
    static void main() {
        int n = 5;
        int[] result = new int[n];
        for (int i = 0; i < n / 2; i++) {
            // We use i + 1 so we don't start with zero
            result[i * 2] = i + 1;
            result[i * 2 + 1] = -(i + 1);
        }

        // If n is odd, the last element is naturally 0
        if (n % 2 != 0) {
            result[n - 1] = 0;
        }

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(n);
    }
}
