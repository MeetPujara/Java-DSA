package Recursion;

public class LinearSearch {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5;
        System.out.println(find(arr,target,0));
    }

    static boolean find(int[] arr,int target,int index){
        if(index == arr.length - 1){
            return false;
        }
        if (arr[index] == target){
            return true;
        }
        return arr[index] != target && find(arr,target,index+1);
    }
}
