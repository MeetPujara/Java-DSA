package Assignments.Array;

import java.util.ArrayList;
import java.util.List;

public class Lucky_Num_Matrix {
    static void main() {
        int[][] matrix = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        // 1. Find the maximum of all row minimums (your logic)
        int max_lucky = Integer.MIN_VALUE;
        int targetCol = -1;

        for (int i = 0; i < m; i++) {
            int rowMin = matrix[i][0];
            int colIdx = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIdx = j;
                }
            }
            if (rowMin > max_lucky) {
                max_lucky = rowMin;
                targetCol = colIdx;
            }
        }

        // 2. VERIFY: Is this value the maximum in its column?
        for (int i = 0; i < m; i++) {
            if (matrix[i][targetCol] > max_lucky) {
                new ArrayList<>(); // Not lucky, return empty list
            }
        }

        // 3. If it passed the check, return it in a list
        List<Integer> result = new ArrayList<>();
        result.add(max_lucky);
        System.out.println(result);
    }
}
