package Assignments.Binary_Search;

public class Find_In_Mountain_Array {
    static void main() {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(search(arr,target));
    }

    public static int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        // try to search in 2nd half
        return orderAgnosticBS(arr,target,peak+1,arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid; // maybe end is our ans that's why end is not mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr,int target,int start,int end){

        boolean isAscending = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAscending){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
