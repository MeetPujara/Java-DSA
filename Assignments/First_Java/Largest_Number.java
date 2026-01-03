package Assignments.First_Java;

import java.util.Scanner;

public class Largest_Number {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = in.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = in.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is Largest");
        }else{
            System.out.println(num2 + " is Largest");
        }
    }
}
