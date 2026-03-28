package Assignments.Binary_Search;

public class Position_of_Element_In_Sorted_Array {
    static void main() {
        int[] arr = {2,3,5,7,8,9,10,11,12,14,16,18,20,22,25};
        int target = 18;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            //double the box size
            end = end + (end - start) * 2;
            start = temp;
        }
        return search(arr,target,start=start,end=end);
    }

    static int search(int[] arr, int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
