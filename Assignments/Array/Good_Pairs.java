package Assignments.Array;

public class Good_Pairs {
    static void main() {
        int[] nums = {1,2,3,1,1,3};
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] == nums[j]){
                    counter++;
                }
            }
        }
        System.out.println("Good Pairs are: " + counter);
    }
}
