package Assignments.Array_Striver;

import java.util.Arrays;

public class Move_Zeros_To_End {
    static void main() {
        int[] arr = {0,1,4,0,5,2};
        int start = arr[0];
        int end = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(start!=end){
                end = start;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
