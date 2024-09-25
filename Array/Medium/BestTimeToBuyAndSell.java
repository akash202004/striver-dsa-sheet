package Array.Medium;

public class BestTimeToBuyAndSell{
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int lowest = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < lowest){
                lowest = arr[i];
                index = i;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = index+1; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        // System.out.println(max);
        System.out.println("The max Profit is: " + (max-lowest));
    }
}