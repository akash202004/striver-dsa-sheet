package BinarySearch.oneDArray;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = new int[2];
        result[0] = findFirstPosition(arr, target);
        result[1] = findLastPosition(arr, target);
        for(int i : result){
            System.out.print(i + " ");
        }
    }

    public static int findFirstPosition(int[] arr, int target) {
        int idx = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(arr[mid] == target) idx = mid;
        }
        return idx;
    }

    public static int findLastPosition(int[] arr, int target) {
        int idx = -1;
    int start = 0;
    int end = arr.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(arr[mid] <= target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
        if(arr[mid] == target) idx = mid;
    }
    return idx;
    }
}
