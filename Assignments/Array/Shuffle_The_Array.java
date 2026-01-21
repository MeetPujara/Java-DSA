package Assignments.Array;

import java.util.Arrays;

public class Shuffle_The_Array {
    static void main() {
        int n = 3;
        int[] arr = {2,3,5,4,1,7};
        int[] new_arr = new int[2*n];
        int i = 0, k = 0, j =n;

        while (i < n){
            new_arr[k] = arr[i];
            k++;
            new_arr[k] = arr[j];
            k++;
            i++;
            j++;
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
