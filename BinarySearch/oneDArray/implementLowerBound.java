package BinarySearch.oneDArray;

public class implementLowerBound {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 11, 12, 19};
        int x = 5;
        int n = arr.length;
        System.out.println(findFloor(arr, n, x));
    }

    public static int findFloor(int[] arr, int n, int x) {  
        int low = 0;
        int high = n - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid;  
            } else if (arr[mid] < x) {
                result = mid;  
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return result; 
    }
}
