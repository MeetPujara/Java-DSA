package Assignments.Methods;

import java.util.Scanner;

public class Addition {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = in.nextInt();
        System.out.print("Enter n2: ");
        int n2 = in.nextInt();
        add(n1,n2);
    }
    static void add(int num1, int num2){
        int sum = num1 + num2;
        System.out.print("Addition of " + num1 + " and " + num2 + " is " + sum);
    }
}
