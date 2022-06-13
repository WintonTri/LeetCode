package inprogress;

import java.util.Arrays;

// Attempt 1 Completed -> 06/12/2022
public class Question1877 {

    public int minPairSum(int[] nums) {
        // Setting up the max pair sum
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            nums[left] = nums[left] + nums[right];
            left++;
            right--;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= left; i++)
            max = Math.max(max, nums[i]);

        return max;
    }

}
