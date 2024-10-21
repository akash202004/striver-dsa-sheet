package BinarySearch.oneDArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class implementUpperBound {
    public static void main(String[] args) {
        int arr[] = {5,6,8,9,6,5,5,6};
        int x = 7;
        int[] result = findFloorAndCeil(arr, x);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
    }

    public static int[] findFloorAndCeil(int[] arr, int x){
        int f = -1;
        int c = -1;
        Arrays.sort(arr);

        for(int num: arr){
            if(num <= x && (f == -1 || num > f)){
                f = num;
            }

            if(num >= x && (c == -1 || num < c)){
                c = num;
            }
        }

        return new int[]{f, c};
    }
}
