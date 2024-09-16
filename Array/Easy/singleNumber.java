package Array.Easy;

public class singleNumber {
    public static void main(String[] args) {
        int nums[] = {1, 2, 0, 2, 1};
        int result = 0;
        for (int num : nums){
            result ^= num;
        }
        System.out.println(result);
    }
}
