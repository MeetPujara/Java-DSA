package Assignments.Binary_Search;

public class findSqrt {
    static void main() {
        int x = 144;
        System.out.println(findPow(x));
    }

    static int findPow(int x){
        int start = 0;
        int end = x;

        while(start<=end){
            int mid = start + (end - start) /2;
            if((mid*mid) <= x){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end;
    }
}
