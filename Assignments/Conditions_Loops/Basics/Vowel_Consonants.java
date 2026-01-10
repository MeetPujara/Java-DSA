package Assignments.Conditions_Loops.Basics;

import java.util.Scanner;

public class Vowel_Consonants {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch = in.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
