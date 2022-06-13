package complete;

// Attempt 1 Completed -> 06/11/2022
public class Question2221 {

    public int triangularSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1; // Return invalid answer

        int iterations = 0;
        while (iterations < nums.length) {
            for (int i = 1; i < nums.length - iterations; i++) {
                nums[i - 1] = (nums[i - 1] + nums[i]) % 10;
            }
            iterations++;
        }

        return nums[0];
    }

}
