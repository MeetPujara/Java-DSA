package Methods;

import java.util.Scanner;

public class ArmStrong {
    static void main() {
        Scanner in = new Scanner(System.in);

//        System.out.print("Enter a Number: ");
//        int n = in.nextInt();
//        System.out.println(isArmStrong(n));

        for (int i = 100; i < 1000; i++) {
            if(isArmStrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmStrong(int n){
        int og = n;
        int sum = 0;

        while (n>0){
            int rem = n % 10;
            n/=10;
            sum = sum + rem*rem*rem;
        }
        return sum == og;
    }
}
