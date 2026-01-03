package Assignments.First_Java;

import java.util.Scanner;

public class Currency {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int curr = in.nextInt();

        float usd = 90.01f;

        float result = curr * usd;

        System.out.println("Result: " + result);
    }
}
