package Assignments.Sorting;

import java.util.Arrays;

public class MissingNumber {
    static void main() {
        int[] arr = {3,0,1};
        cyclic(arr);
    }
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for(int index = 0; index< arr.length; index++){
            if(arr[index]!=index){
                System.out.println(index);
            }
        }
//        System.out.println(arr.length);
    }
}
