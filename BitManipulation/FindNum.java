package BitManipulation;

public class FindNum {
    static void main() {
        int[] arr = {1,1,2,2,3,3,4,4,5};
        System.out.println(find_num_in_arr(arr));
    }

    static int find_num_in_arr(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique^=n;
        }
        return unique;
    }
}
