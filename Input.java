import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Roll Number: ");
        int roll_num = input.nextInt();
        System.out.print("Your Roll Number is: " + roll_num);
        input.close();
    }
}
