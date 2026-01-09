package Assignments.Conditions_Loops.Basics;

public class Str_Reverse {
    static void main() {
        String name = "Meet";
        String rev = "";

        for (int i = 0; i < name.length(); i++) {
            rev = name.charAt(i) + rev;
        }
        System.out.println(rev);
    }
}
