package Assignments.Array_Striver;

public class Single_Number {
    static void main() {
        int[] nums = {4,1,2,1,2};
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        System.out.println(result);
    }
}
