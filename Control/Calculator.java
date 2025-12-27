package Control;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter a operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {

                System.out.print("Enter num1: ");
                int num1 = in.nextInt();
                System.out.print("Enter num2: ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                    System.out.println("Addition of " + num1 + " and " + num2 + " is " + ans);
                } else if (op == '-') {
                    ans = num1 - num2;
                    System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + ans);
                } else if (op == '*') {
                    ans = num1 * num2;
                    System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + ans);
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                        System.out.println("Division of " + num1 + " and " + num2 + " is " + ans);
                    }
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
        }
        System.out.println(ans);
        in.close();
    }
}
