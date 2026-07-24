package MergeSort;

import java.util.Arrays;

public class QuickSort {
    static void main() {
        int[] arr = {87,46,33,91,1,2,4};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int low, int high){
        if(low>=high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while(s<=e){
            while(arr[s]< pivot){
                s++;
            }
            while(arr[e]> pivot){
                e--;
            }

            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }
}
