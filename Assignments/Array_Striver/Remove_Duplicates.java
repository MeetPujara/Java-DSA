package Assignments.Array_Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicates {
    static void main() {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4};

//        ArrayList<Integer> ans = new ArrayList<>();
//        ans.add(arr[0]);
//        for(int i = 1 ; i < arr.length; i++){
//            if(arr[i] != ans.get(ans.size() - 1)){
//                ans.add(arr[i]);
//            }
//
//        }
//        System.out.println(ans);
//    }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
