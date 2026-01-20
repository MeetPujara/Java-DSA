package Assignments.Array;

import java.util.Arrays;

public class Concatenation {
    static void main() {
        int[] nums = {1,2,1};
        int[] ans = new int[6];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));

    }
}
