package Recursion;

public class revSum {
    static void main() {
        System.out.println(revS(5));
    }

    static int revS(int n){
        if(n == 1){
            return n;
        }
        return n + revS(n-1);
    }
}
