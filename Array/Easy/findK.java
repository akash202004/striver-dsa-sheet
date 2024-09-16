package Array.Easy;

public class findK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        int k = 6;
        int N = 5;
        int result = Ksearch(arr, k, N);
        System.out.println(result);
    }

    public static int Ksearch(int[] arr, int k, int N){
        for(int i = 0; i < N; i++){
            if(arr[i] == k){
                return 1;
            }
        }
        return -1;
    }
}
