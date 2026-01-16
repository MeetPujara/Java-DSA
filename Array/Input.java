package Array;

import java.util.Scanner;

public class Input {
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
//            System.out.print(arr[i]);
        }

        for (int i: arr){
            System.out.print(i + " ");
        }
    }
}
