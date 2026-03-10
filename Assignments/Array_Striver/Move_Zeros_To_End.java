package Assignments.Array_Striver;

import java.util.Arrays;

public class Move_Zeros_To_End {
    static void main() {
        int[] arr = {0,1,4,0,5,2};
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
