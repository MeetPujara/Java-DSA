package Assignments.Array_Striver;

public class Second_Largest_Element_Without_Sorting {
    static void main() {
        int[] nums = {9,8,17,16,5};
        int largest = nums[0];
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > second_largest && nums[i] != largest){
                second_largest = nums[i];
            }
        }
        System.out.println(second_largest);
        System.out.println(largest);
    }
}
