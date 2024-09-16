package Array.Easy;

public class consecutiveOnes {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        int result = findConsecutive(nums);
        System.out.println(result);
    }
    public static int findConsecutive(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int num: nums)
            maxCount = Math.max(maxCount, count = num == 0 ? 0 : count + 1);
        return maxCount;
    }
}
