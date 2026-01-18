package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimensional_ArrayList {
    static void main() {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println(list); // At first, it is empty then in next step we've done initialising arraylist.
        //Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //Add Elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
