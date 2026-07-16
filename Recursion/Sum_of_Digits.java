package Recursion;

public class Sum_of_Digits {
    static void main() {
        System.out.println(sum_digi(1234));
    }

    static int sum_digi(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum_digi(n/10);
    }
}
