public class Patterns {
    static void main() {
//        p1(4);
//        p2(5);
//        p3(5);
//        p4(5);
        p5(5);
    }

    static void p1(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p2(int n){
       for(int row = 1; row<=n; row++){
           for(int col = 1; col<=n; col++){
               System.out.print("*");
           }
           System.out.println();
       }
    }

    static void p3(int n){
        for(int row = 1; row<=n; row++){
            for(int col = n; col>row-1; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p4(int n){
        for(int row= 1; row<=n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void p5(int n){
        for(int row = 1; row<=n; row++){
            for(int col =1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 2; row<=n; row++){
            for(int col = n-1; col>=row-1; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
