package Array;

import java.util.Scanner;

public class Max_Value_in_an_Array {
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr[i] = in.nextInt();
        }
        System.out.println("The Maximum Value is: " + max_arr(arr));
    }

    static int max_arr(int[] arr_u) {
        int maxVal = arr_u[0];
        for (int i = 0; i < arr_u.length; i++) {
            if (arr_u[i] > maxVal) {
                maxVal = arr_u[i];
            }
        }
        return maxVal;
    }
}
