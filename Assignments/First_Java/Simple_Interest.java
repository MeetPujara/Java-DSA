package Assignments.First_Java;

import java.util.Scanner;

public class Simple_Interest {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int p = in.nextInt();

        System.out.print("Enter Rate: ");
        int r = in.nextInt();

        System.out.print("Enter Time: ");
        int t = in.nextInt();

        int simple_interest = (p*r*t)/100;
        System.out.println("Simple Interest: " + simple_interest);
    }
}
