package Recursion;

public class CountZeros {
    static void main() {
        System.out.println("Using Recurssion " + recur_approach(1200500349,0));
        System.out.println("Using Iter Approach " + iter_approach(120050));
    }

    static int recur_approach(int n,int counter){
        if(n == 0){
            return counter;
        }

        if (n%10 == 0){
            return recur_approach(n/10,counter+1);
        }
        return recur_approach(n/10,counter);
    }

    static int iter_approach(int n){
        int counter = 0;
        while (n!=0){
            int rem = n % 10;
            n/=10;
            if (rem == 0) {
                counter++;
            }
        }
        return counter;
    }
}
