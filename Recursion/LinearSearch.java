package Recursion;

import java.util.ArrayList;
import java.util.Collection;

public class LinearSearch {
    static void main() {
        int[] arr = {1,2,3,4,5,6,6,7};
        int target = 6;
//        System.out.println(find(arr,target,0));
//        System.out.println(findIndex(arr,target,0));
//        findAllIndex(arr,target,0);
//        System.out.println(li);
        System.out.println(findAllIndexwithList(arr,target,0,new ArrayList<>()));
    }

    static boolean find(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        if (arr[index] == target){
            return true;
        }
        return find(arr,target,index+1);
    }

    static int findIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }

    static ArrayList<Integer> li = new ArrayList<>();
    static void findAllIndex(int[]arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            li.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    static ArrayList<Integer> findAllIndexwithList(int[]arr,int target,int index,ArrayList<Integer> listt){
        if(index == arr.length){
            return listt;
        }
        if(arr[index] == target){
            listt.add(index);
        }
        return findAllIndexwithList(arr,target,index+1,listt);
    }
}
