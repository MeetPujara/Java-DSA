package Recursion;

public class Product_of_Digits {
    static void main() {
        System.out.println(prod_of_dig(6234));
    }

    static int prod_of_dig(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * prod_of_dig(n/10);
    }
}
