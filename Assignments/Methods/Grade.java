package Assignments.Methods;

import java.util.Scanner;

public class Grade {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int mark = in.nextInt();
        display_grade(mark);
    }

    static void display_grade(int mark_of_student){
        if (mark_of_student >= 91 && mark_of_student <= 100){
            System.out.println("Your Grade is: AA");
        } else if (mark_of_student >= 81 && mark_of_student <= 90) {
            System.out.println("Your Grade is: AB");
        } else if (mark_of_student >= 71 && mark_of_student <= 80) {
            System.out.println("Your Grade is: BB");
        } else if (mark_of_student >= 61 && mark_of_student <=70) {
            System.out.println("Your Grade is: BC");
        } else if (mark_of_student >= 51 && mark_of_student <= 60) {
            System.out.println("Your Grade is: CD");
        } else if (mark_of_student >= 41 && mark_of_student <= 50) {
            System.out.println("Your Grade is: DD");
        } else if (mark_of_student > 100) {
            System.out.println("Marks should be entered in 1-100 only");
        } else{
            System.out.println("Fail");
        }
    }
}
