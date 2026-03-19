package Linear_Search;

public class Richest_Customer_Wealth {
    static void main() {
        int[][] accounts = {
                {1,5},
                {7,3},
                {2,1}
        };

        System.out.println(rich(accounts));
    }

    static int rich(int[][] accounts){
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if(sum > maxi){
                maxi = sum;
            }
        }
        return maxi;
    }
}
