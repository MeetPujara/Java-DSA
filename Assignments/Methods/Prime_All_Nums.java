package Assignments.Methods;

import java.util.Scanner;

public class Prime_All_Nums {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        prime_all(num);
    }

    static void prime_all(int n) {
        if (n == 0) {
            System.out.println(0);
        }
        if (n == 1) {
            System.out.println(1);
        }
        for (int i = 2; i < n; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
            }
        }
    }
}
