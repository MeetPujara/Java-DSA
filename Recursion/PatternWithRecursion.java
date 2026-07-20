package Recursion;

public class PatternWithRecursion {
    static void main() {
//        p1(4,0);
        p2(4,0);
    }

    static void p1(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            p1(r,c+1);
        }else{
            System.out.println();
            p1(r-1,0);
        }
    }

    static void p2(int r,int c){
        if(r == 0){
            return;
        }
        if(c<r){
            p2(r,c+1);
            System.out.print("*");
        }else{
            p2(r-1,0);
            if(r>1){
                System.out.println();
            }
        }
    }
}
