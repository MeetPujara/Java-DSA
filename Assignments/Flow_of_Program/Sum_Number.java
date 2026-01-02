package Assignments.Flow_of_Program;

import java.util.Scanner;

public class Sum_Number {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        while (true){
            System.out.print("Enter a Number: ");
            String input = in.nextLine();
            if(input.equalsIgnoreCase("x")) {
                break;
            }
            try{
                int num = Integer.parseInt(input);
                result+=num;
            }catch (NumberFormatException e){
                System.out.println("Invalid Input");
            }
        }
        System.out.println("Result: " + result);
    }
}