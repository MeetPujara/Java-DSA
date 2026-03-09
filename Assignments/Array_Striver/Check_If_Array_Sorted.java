package Assignments.Array_Striver;

public class Check_If_Array_Sorted {
    static void main() {
        int[] arr = {1,6,3,4,5};
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] <= arr[i + 1]) {
                continue;
            }else{
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
