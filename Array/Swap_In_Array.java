package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_In_Array {
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        // 1. Input array elements
        System.out.println("--- Step 1: Fill the Array ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr[i] = in.nextInt();
        }

        System.out.println("\nCurrent Array: " + Arrays.toString(arr));

        // 2. Ask user for swap positions
        System.out.println("\n--- Step 2: Choose Indices to Swap ---");
        System.out.print("Enter the first index (0-4): ");
        int first = in.nextInt();

        System.out.print("Enter the second index (0-4): ");
        int second = in.nextInt();

        // 3. Perform the swap
        // We use the variables 'first' and 'second' instead of hardcoded numbers
        System.out.println("\nSwapping index " + first + " and index " + second + "...");
        swap(arr, first, second);

        // 4. Final Output
        System.out.println("Resulting Array: " + Arrays.toString(arr));
    }

    static void swap(int[] arrr, int index1, int index2) {
        int temp = arrr[index1];
        arrr[index1] = arrr[index2];
        arrr[index2] = temp;
    }
}