package Assignments.Methods;

import java.util.Scanner;

public class Factorial_Prg {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    static int factorial(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
