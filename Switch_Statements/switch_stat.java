package Switch_Statements;

import java.util.Scanner;

public class switch_stat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "apple" -> System.out.println("It is apple");
            case "mango" -> System.out.println("It is Mango");
        }

        in.close();
    }
}
