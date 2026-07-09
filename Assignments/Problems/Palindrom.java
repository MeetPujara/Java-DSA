package Assignments.Problems;

public class Palindrom {
    static void main() {
        String name = "abcdcba";
        int start = 0;
        int end = name.length() - 1;
        boolean flag = true;
        while(start<end){
            if(name.charAt(start) != name.charAt(end)){
                flag = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(flag);
    }
}
