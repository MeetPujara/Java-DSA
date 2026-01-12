package Methods;

import java.util.Scanner;

public class Prime_Nums {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int counter = 2;
        while (counter*counter <= n){
            if (n % counter == 0){
                return false;
            }
            counter++;
        }
        return counter * counter > n;
    }
}
