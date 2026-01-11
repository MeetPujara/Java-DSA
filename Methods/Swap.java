package Methods;

public class Swap {
    static int a = 10;
    static int b = 20;

    static void main() {
        swap();
        System.out.println(a + " " + b);
    }
    static void swap(){
        int temp = a;
        a = b;
        b = temp;
    }
}
