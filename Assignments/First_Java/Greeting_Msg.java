package Assignments.First_Java;

import java.util.Scanner;

public class Greeting_Msg {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = in.next();

        System.out.println("Hi Good Morning " + name);
    }
}
