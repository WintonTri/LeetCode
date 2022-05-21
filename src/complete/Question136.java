package complete;

import java.util.Arrays;

// Attempt 1 Completed -> 05/21/2022
public class Question136 {

    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        Arrays.sort(nums);

        // Checking if the first num is a single
        if (nums[0] != nums[1])
            return nums[0];

        // Checking if the last num is a single
        if (nums[nums.length - 1] != nums[nums.length - 2])
            return nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            // Number is single if it does not equal left or right
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                return nums[i];
        }
        throw new IllegalArgumentException("No single digit in nums");
    }

}
