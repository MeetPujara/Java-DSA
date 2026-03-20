package Binary_Search;

public class first {
    static void main() {
        int[] arr = {2,3,4,5,6,66,77,88,99,100};
        int target = 88;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
