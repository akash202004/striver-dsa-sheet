
import java.util.Stack;

public class moveZeroes {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroFunction(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void moveZeroFunction(int[] nums) {
        int lastNumZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[lastNumZero++] = nums[i];
            }
        }
        for(int i = lastNumZero; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
