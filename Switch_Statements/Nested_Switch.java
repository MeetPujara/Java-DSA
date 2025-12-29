package Switch_Statements;

import java.util.Scanner;

public class Nested_Switch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String department = in.next();

        switch (empId){
            case 1:
                System.out.println("Empid 1");
                break;
            case 2:
                System.out.println("Empid 2");
            case 3:
                System.out.println("Empid 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                }
        }
    }
}
