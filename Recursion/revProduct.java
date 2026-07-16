package Recursion;

public class revProduct {
    static void main() {
        System.out.println(revProd(5));
    }

    static int revProd(int n){
        if(n==1){
//            System.out.println(n);
            return n;
        }
        return n * revProd(n-1);

    }
}
