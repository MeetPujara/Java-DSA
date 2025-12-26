package Control;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = in.nextLong();

        System.out.print("Which number you want to check ? ");
        int target = in.nextInt();
        int count = 0;
        while (n > 0) {
            long rem = n % 10;
            if (rem == target) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
        in.close();
    }
}
