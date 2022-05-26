package complete;

import java.util.Arrays;

// Attempt 1 -> 05/25/2022
public class Question977 {

    public int[] sortedSquares(int[] nums) {
        for (int i = 0 ; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
