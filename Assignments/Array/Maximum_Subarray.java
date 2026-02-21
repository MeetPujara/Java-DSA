package Assignments.Array;

public class Maximum_Subarray {
    static void main() {
        int[] nums = {5,4,-1,7,8};
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);

            if(sum<0) {
                sum = 0;
            }
        }

        System.out.println(max);
        System.out.println(n);
    }
}
