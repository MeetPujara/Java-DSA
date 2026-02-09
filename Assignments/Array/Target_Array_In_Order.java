package Assignments.Array;

import java.util.Arrays;

public class Target_Array_In_Order {
    static void main() {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = target.length-1; j > index[i] ; j--) {
                target[j] = target[j-1];
            }
            target[index[i]] = nums[i];
        }
        System.out.println(Arrays.toString(target));
        System.out.println(nums);
        System.out.println(index);
    }
}
