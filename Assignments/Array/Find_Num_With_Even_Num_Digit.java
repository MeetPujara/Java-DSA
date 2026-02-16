package Assignments.Array;

public class Find_Num_With_Even_Num_Digit {
    static void main() {
        int[] nums = {437,315,322,431,686,264,442};
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if(String.valueOf(nums[i]).length() % 2 == 0){
                even++;
            }
        }
        System.out.println(even);
    }
}