package Assignments.First_Java;

import java.util.Scanner;

public class Arithematic {
    static void main() {
        Scanner in = new Scanner(System.in);
        int result = 0;

        System.out.print("Enter Num1: ");
        int num1 = in.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = in.nextInt();

        System.out.print("Operator: ");
        char op = in.next().trim().charAt(0);

        if (op == 'x' || op == '-' || op == '+' || op == '/'){
            switch (op){
                case 'x':
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case '+':
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case '/':
                    result = num1/num2;
                    System.out.println(result);
                    break;
            }
        }
    }
}
