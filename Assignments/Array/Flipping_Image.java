package Assignments.Array;

import java.util.Arrays;

public class Flipping_Image {
    static void main() {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0,}};
        int m = image.length;
        int n = image[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < (n+1)/2; j++) {
                int temp = image[i][j]^1;
                image[i][j] = image[i][n-j-1] ^1;
                image[i][n-j-1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(image));
        System.out.println(m);
    }
}
