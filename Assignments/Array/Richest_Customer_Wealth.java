package Assignments.Array;

public class Richest_Customer_Wealth {
    static void main() {
        int maxi = Integer.MIN_VALUE;
        int[][] accounts ={{1,2,1},{3,2,1}};
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            maxi = Math.max(maxi,sum);
        }
        System.out.println(maxi);
    }
}
