package Assignments.Flow_of_Program;

import java.util.Scanner;

public class Multiplication_Table {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Table Num: ");
        int n = in.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}
