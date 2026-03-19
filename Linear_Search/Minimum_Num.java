package Linear_Search;

public class Minimum_Num {
    static void main() {
       int[] arr = {1,25,6,7,8,9,0};
       findMin(arr);
    }

    static void findMin(int[] arr){
        int min_num = arr[0];
        for(int i = 0;i<arr.length; i++){
            if(arr[i] < min_num){
                min_num = arr[i];
            }
        }
        System.out.println(min_num);
    }
}
