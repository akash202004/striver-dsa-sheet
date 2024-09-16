package Array.Easy;

public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,5,7,0,1};
        int n = arr.length;
        int result = missingNumberFromTheArrya(arr,n);
        System.out.println(result);
    }
    public static int missingNumberFromTheArrya(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int result = 0;
        for(int i = 0; i < n; i++) {
            result += arr[i];
        }
        return sum - result;
    }
}
