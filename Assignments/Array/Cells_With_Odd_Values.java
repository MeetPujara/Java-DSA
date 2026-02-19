package Assignments.Array;

public class Cells_With_Odd_Values {
    static void main() {
        int m = 2;
        int n = 3;
        int [][] ans = new int[m][n];
        int [][] indices = {{0,1},{1,1}};
        int counter = 0;

        for (int i = 0; i < indices.length; i++) {
            //row is constant
            for (int j = 0; j < n; j++) {
                ans[indices[i][0]][j]++;
            }
            //column is constant
            for (int k = 0; k < m; k++) {
                ans[k][indices[i][1]]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(ans[i][j] %2 != 0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
