package Assignments.Array_Striver;

public class Missing_Number {
    static void main() {
        int[] nums =  {3,0,1};
        int n = nums.length;
        int sum = 0;
        int sum_form = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        for(int i =0; i<n; i++) {
            sum_form = n * (n + 1) / 2;
        }
        System.out.println(sum_form-sum);
    }
}
