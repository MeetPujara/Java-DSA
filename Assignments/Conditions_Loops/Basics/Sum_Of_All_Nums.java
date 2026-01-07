package Assignments.Conditions_Loops.Basics;

import java.util.Scanner;

public class Sum_Of_All_Nums {
    static void main() {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.print("Enter a Number: ");
            int n = in.nextInt();
            if (n == 0){
                break;
            }else{
                sum += n;
                n -= 1;
            }
        }
        System.out.println(sum);
    }
}
