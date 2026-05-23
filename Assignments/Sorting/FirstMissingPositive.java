package Assignments.Sorting;

import java.util.Arrays;

public class FirstMissingPositive {
    static void main() {
        int[] nums = {7,8,9,10,11,12};
        System.out.println(FMP(nums));
    }
    static int FMP(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i]<nums.length && nums[i]!=nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
        for(int index = 0; index<nums.length; index++){
            if(nums[index]!=index+1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }
}
