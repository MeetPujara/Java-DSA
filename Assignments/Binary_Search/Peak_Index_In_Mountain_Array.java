package Assignments.Binary_Search;

public class Peak_Index_In_Mountain_Array {
    static void main() {
        int[] arr = {1,0,1};
        System.out.println(peakIndexInMountainArray(arr));
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
        return arr[start];
    }
}
