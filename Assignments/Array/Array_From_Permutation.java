package Assignments.Array;

import java.util.Arrays;

public class Array_From_Permutation {
    static void main() {
        int[] nums = {5,0,1,2,3,4};
        int[] ans = new int[6];

        for (int i = 0; i < nums.length; i++) {
            ans[i]+=nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
