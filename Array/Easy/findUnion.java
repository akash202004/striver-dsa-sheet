package Array.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class findUnion {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2 [] = {1, 2, 3, 6, 7};

        ArrayList<Integer> unionResult = Union(arr1, arr2);

        System.out.println(unionResult);
    }
    public static ArrayList<Integer> Union(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        ArrayList<Integer> result = new ArrayList<>(set);
//        Collections.sort(result);

        return result;

    }
}
