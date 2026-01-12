package Methods;

import java.util.Arrays;

public class VarArgs {
    static void main() {
        fun(1,2,3,4,5,6,7,8,9,10);
        multiple(5,7,"Hi","Hello");
    }

    static void multiple(int a,int b, String ...s){
        System.out.println(Arrays.toString(s));
        System.out.println("a: " + a + ", b: " + b);
        //variable length argument should be at last while declaring
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
