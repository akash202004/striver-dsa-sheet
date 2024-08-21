
public class largestElemInArr {
    class Solution {
        public static int largest(int n, int[] arr) {
            // code here
            int largest = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(largest < arr[i]){
                    largest = arr[i];
                }
            }
            return largest;
        }
    }

}
