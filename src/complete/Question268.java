package complete;

import java.util.Arrays;

// Attempt 1 Completed -> 05/21/2022
public class Question268 {

    public int missingNumber(int[] nums) {
        Arrays.sort((nums));
        for (int i = 0; i < nums.length; i++) { // -1 Since there should be a missing number
            if (i != nums[i])
                return i;
        }
        return nums.length; // Very last number is missing
    }

}
