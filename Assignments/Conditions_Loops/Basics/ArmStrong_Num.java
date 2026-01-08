package Assignments.Conditions_Loops.Basics;

import java.util.Scanner;

public class ArmStrong_Num {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        int ans = 0;
        int temp = num;
        while (temp > 0){
            int rem = temp % 10;
            temp/=10;
            ans += (int) Math.pow(rem,String.valueOf(num).length());
        }
        if (num == ans){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not");
        }

    }
}
