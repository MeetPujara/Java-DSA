package Methods;

public class Overloading {
    static void main() {
        fun(36);
        fun("Meet");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
