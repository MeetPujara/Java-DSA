package Assignments.Methods;

import java.util.Scanner;

public class Sum_of_first_n_nums {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        sum_n_num(num);
    }

    static void sum_n_num(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
