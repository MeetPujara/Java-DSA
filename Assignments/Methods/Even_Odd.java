package Assignments.Methods;

public class Even_Odd {
    static void main() {
        even_odd(5);
    }
    static void even_odd(int n){
        if (n % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
