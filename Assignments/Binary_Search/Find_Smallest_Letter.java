package Assignments.Binary_Search;

public class Find_Smallest_Letter {
    static void main() {
        char[] letters = {'c','f','j'};
        char target = 'j';
        int start = 0;
        int end = letters.length - 1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(target<letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        System.out.println(letters[start % letters.length]);
    }
}
