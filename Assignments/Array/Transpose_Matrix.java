package Assignments.Array;

import java.util.Arrays;

public class Transpose_Matrix {
    static void main() {
        int[][] transpose = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row_len = transpose.length;
        int col_len = transpose[0].length;
        int[][] ans = new int[col_len][row_len];
        for (int i = 0; i < row_len; i++) {
            for (int j = 0; j < col_len; j++) {
                ans[i][j] = transpose[j][i];
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
