
import java.util.Stack;

public class moveZeroes {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroFunction(arr);
        // Print the array to see the resul
    }
    public static void moveZeroFunction(int[] nums){
        Stack<Integer> sk = new Stack<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count = count + 1;
            }else{
                sk.push(nums[i]);
            }
        }
        for(int i  = 0; i < count; i++){
            sk.push(0);
        }
        for(int i = nums.length; i <= 0; i--){
            nums[i] = sk.peek();
            sk.pop();
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
