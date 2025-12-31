package Assignments.Flow_of_Program;

import java.util.Scanner;

public class two_num_add {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = in.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = in.nextInt();

        int result = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + result);
    }
}
