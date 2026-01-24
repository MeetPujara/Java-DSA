package Assignments.Array;

import java.util.ArrayList;

public class SmallerNumThenCurrent {
    static void main() {
        int[] arr = {8,1,2,2,3};
        ArrayList<Integer> li = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] < arr[j]){
                    counter++;
                }
            }
        }
        li.add(counter);
        System.out.println(li);
    }
}
