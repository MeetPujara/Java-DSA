package Assignments.First_Java;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.next();

        int start_str = 0;
        int ending_str = str.length() - 1;
        boolean flag = true;
        while (start_str <= ending_str) {
            if (str.charAt(start_str) == str.charAt(ending_str)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            start_str += 1;
            ending_str -= 1;
        }
        if (flag) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not");
        }
    }
}