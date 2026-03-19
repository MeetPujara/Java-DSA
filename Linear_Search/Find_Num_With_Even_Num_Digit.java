package Linear_Search;

import java.util.Arrays;

public class Find_Num_With_Even_Num_Digit {
    static void main() {
        int[] nums = {12,345,2,6,7896};
        int even = 0;

        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                even++;
            }
        }
        System.out.println(even);
    }
}
