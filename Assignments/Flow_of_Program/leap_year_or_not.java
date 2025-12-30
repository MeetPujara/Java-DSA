package Assignments.Flow_of_Program;

import java.util.Scanner;

public class leap_year_or_not {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year = in.nextInt();

        if (year%4 == 0){
            System.out.println("Leap Year");
            }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
