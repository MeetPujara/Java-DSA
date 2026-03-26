package Assignments.Binary_Search;

public class Valid_Perfect_Square {
    static void main() {
        System.out.println(isPerfectSquare(16));
    }
    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;
        while(start<=end){
            long mid = start + (end - start)/2;
            long val = mid * mid;
            if(val > num){
                end = mid - 1;
            }else if (val < num){
                start = mid + 1;
            }else if(val == num){
                return true;
            }
        }
        return false;
    }
}
