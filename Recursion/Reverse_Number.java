package Recursion;

public class Reverse_Number {
    static void main() {
        print_rev_num(65789);
        System.out.println(return_rev_num(6889));
    }

    static void print_rev_num(int n){
        if (n < 10){
            System.out.println(n);
            return;
        }
        System.out.print(n%10);
        print_rev_num(n/10);
    }

    static int return_rev_num(int n){
        return helper(n,0);
    }

    static int helper(int n, int rev){
        if(n == 0){
            return rev;
        }
        return helper(n/10,rev*10 + (n%10));
    }
}
