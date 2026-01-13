package Assignments.Methods;

import java.util.Scanner;

public class Circle {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Value of r: ");
        int r = in.nextInt();
        shape(r);
    }

    static void shape(int radius){
        double area = Math.PI * (radius * radius);
        System.out.printf("Area is: %.2f", area);

        double circumference = 2 * Math.PI * radius;
        System.out.printf( "\nCircumference is: %.2f",circumference) ;
    }
}
