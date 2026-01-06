package Assignments.Conditions_Loops.Basics;

import java.util.Scanner;

public class Fibo {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int p = 0;
        int i = 1;
        int counter = 2;

        while (counter<=num){
            int temp = i;
            i = i + p;
            p = temp;
            counter ++;
        }
        System.out.println(i);
    }
}
