package Assignments.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greatest_Number_Candies {
    static void main() {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        int maxi = Arrays.stream(candies).max().getAsInt();
        List<Boolean> li = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int result = candies[i] + extraCandies;
            li.add(result >= maxi);
        }
        System.out.println(li);
    }
}
