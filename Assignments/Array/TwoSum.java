package Assignments.Array;

import java.util.ArrayList;

public class TwoSum {
    static void main() {
        int[] nums = {2,7,11,15};
//        int[] temp = nums;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        System.out.println(list);
    }
}
