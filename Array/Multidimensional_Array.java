package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_Array {
    static void main() {
        // Syntax
//        int[][] arr = new int[3][];

//        int[][] arr2D = {
//                {1,2,3}, // 0th-index
//                {4,5}, // 1st-index
//                {6} // 2nd-index
//        };
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

//        for (int row = 0; row< arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        for (int[] a: arr){
//            System.out.println(Arrays.toString(a));
//        }
    }
}

