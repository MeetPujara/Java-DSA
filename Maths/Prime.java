package Maths;

public class Prime {
    static void main() {
        int n = 50;
        System.out.println(prime(n));
    }

    static String prime(int n){
        if(n<=1){
            return "Not Prime";
        }
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            return "Prime";
        }else{
            return "Not Prime";
        }
    }
}
