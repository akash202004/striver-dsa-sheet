package Array.Easy;

public class sorted_rotated {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int n = arr.length;
        boolean result = checkSortedAndRotated(arr, n);
        System.out.println(result);
    }
    public static boolean checkSortedAndRotated(int[] nums, int n) {
        int breaks = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i+1)%n]){
                breaks++;
            }
            if(breaks>1){
                return false;
            }
        }
        return true;
    }
}
