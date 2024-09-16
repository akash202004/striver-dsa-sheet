package Array.Easy;

public class peakElem {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 1, 1, 1};
        int n = 7;
        int result = peakElement(arr, n);
        System.out.println(result);
    }
        public static int peakElement(int[] arr,int n)
        {
            //add code here.
            int low = 0;
            int high = n - 1;
            while(low < high){
                int mid = low + (high-low) / 2;
                if(arr[mid] < arr[mid+1]){
                    low = mid + 1;
                }else{
                    high = mid;
                }
            }
            return low;
        }
    }
