package Assignments.Array_Striver;

import java.util.Arrays;

public class Rotate_Array_By_K_Places {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        int n = arr.length;
        k = k % n;

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }
        for (int i = n-k; i < n; i++) {
            arr[i] = temp[i-(n-k)];
        }
        System.out.println(Arrays.toString(arr));
    }
}
