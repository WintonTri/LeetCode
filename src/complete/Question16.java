package complete;

import java.util.Arrays;

// Attempt 1 Completed -> 05/29/2022
public class Question16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        // Subtract two since three numbers are used to calculate
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > target) { // Need to get a smaller sum
                    right--;
                } else { // Need a larger sum
                    left++;
                }

                // Updating closest, If the stored difference is greater...
                if (Math.abs(closest - target) > Math.abs(sum - target))
                    closest = sum;
            }
        }

        return closest;
    }

}
