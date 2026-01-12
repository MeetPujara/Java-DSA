package Assignments.Methods;

public class Vote {
    static void main() {
        elgible_to_vote(19);
    }

    static void elgible_to_vote(int age){
        if (age >= 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You cannot vote");
        }
    }
}
