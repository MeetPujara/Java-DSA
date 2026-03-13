package Assignments.Array_Striver;

public class Maximum_Consecutive_Ones {
    static void main() {
        int[] nums = {1,1,0,1,1,1};
        int counter = 0;
        int max_counter = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                ++counter;
                max_counter = Math.max(max_counter,counter);
            }else{
                max_counter = Math.max(max_counter,counter);
                counter = 0;
            }
        }
        System.out.println(max_counter);
    }
}
