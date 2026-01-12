package Assignments.Methods;

import java.util.Scanner;

public class Maximum_Minimum {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = in.nextInt();

        System.out.print("Enter num2: ");
        int num2 = in.nextInt();

        System.out.print("Enter num3: ");
        int num3 = in.nextInt();

        System.out.println("Largest Number is: " + maxi(num1,num2,num3));
        System.out.println("Smallest Number is: " + mini(num1,num2,num3));
    }

    static int maxi(int n1, int n2, int n3){
        int maximum = n1;

        if (n2 > maximum){
            maximum = n2;
        }
        if(n3 > maximum){
            maximum = n3;
        }
        return maximum;
    }

    static int mini(int n1,int n2,int n3){
        int minimum = n1;

        if (n2 < minimum){
            minimum = n2;
        }
        if (n3 < minimum){
            minimum = n3;
        }
        return minimum;
    }
}
