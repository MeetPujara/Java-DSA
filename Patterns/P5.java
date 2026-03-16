package Patterns;

public class P5 {
    static void main() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5 - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
