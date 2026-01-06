package Assignments.Conditions_Loops.Basics;

import java.util.Scanner;

public class Product_Sum {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;
        int prod = 1;
//        int num = 4421;
        while (num > 0){
            int rem = num % 10;
            num/=10;
            prod *= rem;
            sum += rem;
        }
        int result = prod - sum;
        System.out.println(result);
    }
}
