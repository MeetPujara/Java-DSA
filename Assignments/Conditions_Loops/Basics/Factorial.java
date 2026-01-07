package Assignments.Conditions_Loops.Basics;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
