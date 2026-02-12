package Assignments.Array;

public class Max_From_2DArr {
    static void main() {
        int[][] nums = {
                {1,10,3,8},
                {9,12,6,7},
                {5,2,11,4},
        };

        for (int i = 0; i < 3; i++) {
            int maxi = nums[i][0];
            for (int j = 0; j < 4; j++) {
                maxi = (nums[i][j] > maxi) ? nums[i][j] : maxi;
            }
            System.out.println("Row: " + (i+1) + ": " + maxi);
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            int maxi = nums[0][i];
            for (int j = 0; j < 3; j++) {
                maxi = (nums[j][i] > maxi) ? nums[j][i] : maxi;
            }
            System.out.println("Col: " + (i+1) + ": " + maxi);
        }
    }
}
