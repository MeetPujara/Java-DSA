package Assignments.Array;

public class Sum_Of_2d_Arr {
    static void main() {
        int[][] nums = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        // i<3 means i < row length
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            // j<4 means j < column length
            for (int j = 0; j < 4; j++) {
                sum+=nums[i][j];
            }
//            System.out.println("The sum of row " + (i+1) + ": " + sum);
        }

        // i < 4 bcoz i < col length
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            // j < 3 bcoz j < row length
            for (int j = 0; j < 3; j++) {
                sum+=nums[j][i];
            }
            System.out.println("The sum of col " + (i+1) + ": " + sum);
        }
    }
}
