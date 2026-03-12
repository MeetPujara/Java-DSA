package Assignments.Array_Striver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Union_of_2_Sorted_arrays {
    static void main() {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6,7,8};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            set.add(b[i]);
        }
        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        System.out.println(result);
    }
}
