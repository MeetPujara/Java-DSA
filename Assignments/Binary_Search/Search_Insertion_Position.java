package Assignments.Binary_Search;

public class Search_Insertion_Position {
    static void main() {
        int[] nums = {1,3,5,6};
        int target = 5;
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            int mid = start + (end - start) /2;
            if(nums[mid] == target){
                System.out.println(mid);
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        System.out.println(start);
    }
}
