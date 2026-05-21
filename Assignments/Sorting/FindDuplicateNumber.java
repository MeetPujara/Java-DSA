package Assignments.Sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumber {
    static void main() {
        int[] arr = {3,1,3,4,2};
//        finddup(arr);
        findDup(arr);
    }

//    static void finddup(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[j]);
//                    break;
//                }
//            }
//        }
//    }

    static int findDup(int[] nums){
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!ans.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}
