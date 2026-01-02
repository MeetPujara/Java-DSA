package Assignments.First_Java;

import java.util.Scanner;

public class Even_Odd {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = in.nextInt();

        if(num%2 == 0){
            System.out.print(num + " Is Even");
        }else{
            System.out.print(num + " Is Odd");
        }
    }
}
