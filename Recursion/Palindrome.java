package Recursion;

public class Palindrome {
    static void main() {
        System.out.println(pal(-122));
    }

    static int helper(int n,int rev){
        if(n == 0){
            return rev;
        }
        return helper(n/10,rev*10 + (n%10));

    }

    static int rev(int n){
        return helper(n,0);
    }

    static boolean pal(int n){
        if(n < 0)
            return false;
        return n == rev(n);
    }
}
