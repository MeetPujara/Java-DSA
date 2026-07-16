package Recursion;

public class reversePrint {
    static void main() {
        printRev(5);
        print(2);
    }

    static void printRev(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printRev(n-1);
    }

    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
