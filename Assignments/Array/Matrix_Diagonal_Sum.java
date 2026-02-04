package Assignments.Array;

public class Matrix_Diagonal_Sum {
    static void main() {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum+=mat[i][i];
            sum+=mat[n - 1 - i][i];
        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        System.out.println(sum);
        System.out.println(mat);
        System.out.println(n);
    }
}
