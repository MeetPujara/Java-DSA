package Assignments.Sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInArray {
    static void main() {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDup(nums));
    }
    static List<Integer> findDup(int[] nums){
        Set<Integer> ans = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!ans.add(nums[i])){
                duplicates.add(nums[i]);
            }
        }
        return duplicates;
    }
}
