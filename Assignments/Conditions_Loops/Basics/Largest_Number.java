package Assignments.Conditions_Loops.Basics;

import java.util.Scanner;

public class Largest_Number {
    static void main() {
        Scanner in = new Scanner(System.in);
        int max_value = (int) Double.NEGATIVE_INFINITY;
        while (true) {
            System.out.print("Enter a Number: ");
            int num = in.nextInt();
            if (num == 0) {
                break;
            } else {
                max_value = Math.max(num, max_value);
            }
        }
        System.out.println(max_value);
    }
}