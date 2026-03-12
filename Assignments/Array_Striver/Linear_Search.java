package Assignments.Array_Striver;

public class Linear_Search {
    static void main() {
        int[] arr = {1,2,3,4,5};
        int x = 2;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                System.out.println(i);
            }
        }
    }
}
