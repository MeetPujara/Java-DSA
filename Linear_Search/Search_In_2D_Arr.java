package Linear_Search;

import java.util.Arrays;

public class Search_In_2D_Arr {
    static void main() {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {20,30,40}
        };

        int target = 30;
        int[] ans = search(arr,target);
        System.out.println("Target is " + target + " and" + " Location is " + Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
