package Recursion;

public class Fibonaaci {
    static void main() {
        System.out.println(fib(5));
    }

    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
