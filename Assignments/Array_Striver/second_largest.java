package Assignments.Array_Striver;

public class second_largest {
    static void main() {
        int[] arr = {2,1,17,6,5};
        int max_num = arr[0];
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max_num){
                max_num = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > second_largest && arr[i]!= max_num){
                second_largest = arr[i];
            }
        }
        System.out.println(second_largest);
    }
}
