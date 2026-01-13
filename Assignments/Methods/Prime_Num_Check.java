package Assignments.Methods;

import java.util.Scanner;

public class Prime_Num_Check {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        prime(num);
    }

    static void prime(int n){
        int counter = 2;
        if (n == 1){
            System.out.println(1);
        }
        if (n == 0){
            System.out.println(0);
        }
        while(counter*counter <= n){
            if (n % counter == 0){
                System.out.println(n + " is Not Prime");
            }else{
                System.out.println(n + " is Prime");
            }
            counter ++;
        }

    }
}
