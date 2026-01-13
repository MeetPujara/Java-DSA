//package Assignments.Methods;
//
//import java.util.Scanner;
//
//public class Pythagorean_Triplet {
//    static void main() {
//        pythagorean_triple();
//    }
//    static void pythagorean_triple(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("How many numbers do you want to enter? ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter " + n + " numbers: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//        int sq_a = 0;
//        int sq_b = 0;
//        int sq_c = 0;
//        boolean result = false;
//        for (int i = 0; i < arr.length; i++) {
//            sq_a = arr[i] * arr[i];
//            for (int j = 0; j < arr.length; j++){
//                sq_b = arr[j] * arr[j];
//                for (int k = 0; k < arr.length; k ++){
//                    sq_c = arr[k] * arr[k];
//                    int res = sq_a + sq_b;
//                    if (res == sq_c){
//                        result = true;
//                    }
//                }
//            }
//        }
//        if (result){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }
//    }
//}


// -------- Optimised ----------

package Assignments.Methods;
import java.util.Scanner;

public class Pythagorean_Triplet {
    static void main(String[] args) {
        pythagorean_triple();
    }

    static void pythagorean_triple() {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        boolean result = false;

        // Triple nested loop to check combinations
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {

                    int sq_a = arr[i] * arr[i];
                    int sq_b = arr[j] * arr[j];
                    int sq_c = arr[k] * arr[k];

                    if (sq_a + sq_b == sq_c) {
                        result = true;
                        break; // Stops the 'k' loop
                    }
                }
                if (result) break; // Stops the 'j' loop
            }
            if (result) break; // Stops the 'i' loop
        }

        System.out.println("Result: " + result);
    }
}