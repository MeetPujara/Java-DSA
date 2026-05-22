package Assignments.Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMisMatch {
    static void main() {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(dups(nums)));
    }
    static int[] dups(int[] nums){
        int duplicate = -1;
        Set<Integer> ans = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            if(!ans.add(nums[i])){
                duplicate = nums[i];
            }
        }
        int missingNum = -1;
        for(int index = 1; index<=nums.length; index++){
            if(!ans.contains(index)){
                missingNum = index;
                break;
            }
        }
        return new int[]{duplicate, missingNum};
    }
}
