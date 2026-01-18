package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrg {
    static void main() {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(1);
//        list.add(10);
//        list.add(100);
//        list.add(1000);

//        System.out.println(list.contains(100));
//        list.set(0,9);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
//        System.out.println(list);

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] will not work here.
        }
    }
}
