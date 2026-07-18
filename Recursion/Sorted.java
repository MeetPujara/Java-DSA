package Recursion;

public class Sorted {
    static void main() {
        int[] arr = {1,2,3,4};
        System.out.println(sortt(arr,0));
    }

    static boolean sortt(int[] arr,int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sortt(arr,index+1);
    }
}
