package BinarySearch.oneDArray;

public class numberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);
        if(first == -1){
            System.out.println("Number of occurrence of " + target + " is: 0");
            return;
        }
        int count = last - first + 1;
        System.out.println("Number of occurrence of " + target + " is: " + count);
    }

    public static int findFirstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                first = mid;
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return first;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                last = mid;
                start = mid + 1;
            }else if(arr[mid] < target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return last;
    }
}
