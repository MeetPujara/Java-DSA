package Methods;

import java.util.Scanner;

public class Add_Two_Nums {
    static void main() {
        add();
    }
    static void add(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = in.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
