package complete;

import java.util.Arrays;

// Attempt 1 & 2 Completed -> 05/29/2022
public class Question1685 {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            int value = 0;

            for (int j : nums)
                value += Math.abs(nums[i] - j);

            result[i] = value;
        }

        return result;
    }

    // Looked at hint for this
    public int[] getSumAbsoluteDifferences2(int[] nums) {
        int n = nums.length, leftSum = 0, rightSum = Arrays.stream(nums).sum();
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = i * nums[i] - leftSum + rightSum - (n - i) * nums[i];
            leftSum += nums[i];
            rightSum -= nums[i];
        }
        return res;
    }

}
