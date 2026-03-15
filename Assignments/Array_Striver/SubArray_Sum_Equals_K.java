package Assignments.Array_Striver;

public class SubArray_Sum_Equals_K {
    static void main() {
        int[] nums = {1,2,3};
        int k = 3;
        int counter = 0;
        for(int i = 0; i<nums.length; i++){
            int sum = 0;
            for(int j = i; j<nums.length; j++){
                sum+=nums[j];
                if(sum == k){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
