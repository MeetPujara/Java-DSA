package Assignments.First_Java;

import java.util.Scanner;

public class Armstrong_Number {
    static void main() {
        Scanner in = new Scanner(System.in);

        int x = 0;
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        int temp = num;
        int po = 0;
        while (temp>0){
            int rem = temp % 10;
            temp/=10;
            po += (int) Math.pow(rem,String.valueOf(num).length());
        }
        if (po == num){
            System.out.println("ArmStrong");
        }else{
            System.out.println("Not");
        }
    }
}
