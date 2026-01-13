package Assignments.Methods;

import java.util.Scanner;

public class Palindrome_Num {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Num: ");
        int num = in.nextInt();
        palindrome(num);
    }

    static void palindrome(int n){
        int ans = 0;
        int temp = n;
        while(temp>0){
            int rem = temp % 10;
            temp = temp/10;
            ans = ans * 10 + rem;
        }
        if (n == ans){
            System.out.println(n + " is Palindrome");
        }else{
            System.out.println(n + " is Not Palindrome");
        }
    }
}
