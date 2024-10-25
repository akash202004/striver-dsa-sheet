package BinarySearch.oneDArray;

public class searchInsertPosition{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,};
        int x = 5;
        System.out.println(searchInsert(arr, x));
    }

    public static int searchInsert(int []arr, int x){
        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return arr[low] < x ? low + 1 : low;
    }
}