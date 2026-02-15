package Assignments.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_To_Array_Form_Integer {
    static void main() {
        int[] num = {2,1,5};
        int k = 806;

        List<Integer> ans = new ArrayList<>();

        int p = num.length - 1;
        int carry = 0;

        while(p>=0 || k >0){
            int numval = 0;
            if(p>=0){
                numval = num[p];
            }

            int rem_k = k % 10;

            int sum = numval + rem_k + carry;

            int digit = sum % 10;
            carry = sum/10;

            ans.add(digit);

            p--;
            k/=10;
        }
        if(carry > 0){
            ans.add(carry);
        }

        Collections.reverse(ans);
        System.out.println(ans);
        System.out.println(k);
    }
}
