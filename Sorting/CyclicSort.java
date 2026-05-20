package Sorting;

import java.util.Arrays;

public class CyclicSort {
    static void main() {
        int[] arr = {3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex= arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
    }
}
