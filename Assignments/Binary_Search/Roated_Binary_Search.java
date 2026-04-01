package Assignments.Binary_Search;

public class Roated_Binary_Search {
    static void main() {
        int[] nums = {3,4,5,6,1,2};
        int target = 2;
        Roated_Binary_Search rbs = new Roated_Binary_Search();
        System.out.println(rbs.findPivot(nums));
    }
    public int search(int[] nums, int target) {
        // if we didn't find pivot then array is not rotated.
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binary_search(nums,target,0,nums.length - 1);
        }
        //if pivot is found means we've to 2 ascending sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binary_search(nums,target,0,pivot - 1);
        }
        return binary_search(nums,target,pivot+1,nums.length-1);
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

    int binary_search(int[] nums,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return - 1;
    }
}
