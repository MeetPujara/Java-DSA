package Linear_Search;

public class Search_In_Range {
    static void main() {
        int[] arr = {18,12,-7,6,5,40};
        int target = -77;
        System.out.println(search_range(arr,target,0,3));
    }

    static String search_range(int[] arr, int target, int start, int end){
        for(int i = start; i<=end; i++){
            if(target == arr[i]){
                return "index is " + i + " and value is " + target;
            }
        }
        return "Not found";
    }
}
