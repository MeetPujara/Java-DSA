package Assignments.Conditions_Loops.Basics;

import java.util.Scanner;

public class Sum_Of_N_Nums {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = in.nextInt();

        int sum_value = n *(n+1)/2;
        System.out.println(sum_value);
    }
}
