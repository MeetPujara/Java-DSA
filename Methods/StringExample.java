package Methods;

import java.util.Scanner;

public class StringExample {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter String: ");
        String naam = in.next();
        String personalized = greet(naam);
        System.out.println(personalized);
    }

    static String greet(String name){
        return "Hello " + name;
    }
}
