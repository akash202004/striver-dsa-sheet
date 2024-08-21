
public class removeDublicateFromSorted {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDub(arr);
        System.out.println(result);
        for(int i=0; i<result;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeDub(int[] arr) {
        if(arr.length == 0) return 0;

        int uniqueElem = 1;

        for(int i=1;i<arr.length;i++) {
            if(arr[i] != arr[i-1]){
                arr[uniqueElem] = arr[i];
                uniqueElem++;
            }
        }
        return uniqueElem;
    }
}
