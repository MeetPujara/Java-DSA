package Assignments.Conditions_Loops.Basics;

import java.util.Scanner;

public class Sum_Of_Numbers {
    static void main() {
        Scanner in = new Scanner(System.in);

        int neg_num = 0;
        int pos_even_num = 0;
        int pos_odd_num = 0;

        while (true){
            System.out.print("Enter a Number: ");
            int n = in.nextInt();

            if (n != 0){
                if (n < 0){
                    neg_num = neg_num + n;
                }
                if (n % 2 == 0 && n > 0) {
                    pos_even_num = pos_even_num + n;
                }
                if (n % 2 != 0 && n > 0){
                    pos_odd_num = pos_odd_num + n;
                }
            }else{
                break;
            }
        }
        System.out.println("Addition of Negative Numbers: " + neg_num);
        System.out.println("Addition of Positive Even Number: " + pos_even_num);
        System.out.println("Addition of Positive Odd Number: " + pos_odd_num);
    }
}
