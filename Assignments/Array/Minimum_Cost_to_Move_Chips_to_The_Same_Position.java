package Assignments.Array;

public class Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    static void main() {
        int[] position = {1,2,2,2,2};
        int even = 0,odd=0;

        for (int i = 0; i < position.length; i++) {
            if(position[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        if(even == position.length || odd == position.length) System.out.println(0);
        System.out.println(Math.min(even,odd));
    }
}
