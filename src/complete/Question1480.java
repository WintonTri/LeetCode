package complete;

// Attempt 1 & 2 -> 05/23/2022
public class Question1480 {

    public int[] runningSum(int[] nums) {
        int[] runningNums = new int[nums.length];
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            runningNums[i] = total;
        }

        return runningNums;
    }

    // Attempt at lower memory usage
    public int[] runningSumSecondAttempt(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i]; // Can simplify to nums[i] += nums[i-1]
        }
        return nums;
    }

}
