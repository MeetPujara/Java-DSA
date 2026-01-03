package Assignments.First_Java;

import java.util.Scanner;

public class Fibo {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int p=0;
        int i=1;
        int count = 2;

        while (count<=num){
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}
