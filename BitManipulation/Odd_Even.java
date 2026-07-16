package BitManipulation;

import java.util.Scanner;

public class Odd_Even {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if ((num&1) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
