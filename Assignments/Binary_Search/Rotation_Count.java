package Assignments.Binary_Search;

public class Rotation_Count {
    static void main() {
        int[] nums = {3,4,5,6,1,2};
//        int target = 2;
        Roated_Binary_Search rbs = new Roated_Binary_Search();
        int pivot = rbs.findPivot(nums);
        int rotationCount = pivot + 1;
        System.out.println("The array is rotated " + rotationCount + " times.");

    }
    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
