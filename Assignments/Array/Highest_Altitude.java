package Assignments.Array;

public class Highest_Altitude {
    static void main() {
        int[] gain = {-5,1,5,0,-7};
        int current_alt = 0;
        int max_alt = 0;

        for (int i = 0; i < gain.length; i++) {
            current_alt+=gain[i];
            max_alt = Math.max(current_alt,max_alt);
        }
        System.out.println(max_alt);
    }
}
