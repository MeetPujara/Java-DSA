package Assignments.Methods;

import java.util.Scanner;

public class Product {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = in.nextInt();
        System.out.print("Enter n2: ");
        int n2 = in.nextInt();
        System.out.print("Product of " + n1 + " and " + n2 + " is " + mul(n1,n2));
    }
    static int mul(int num1, int num2){
        return num1 * num2;
    }
}
