package complete;

import java.util.Arrays;

// Attempt 1 Completed -> 05/21/2022
public class Question217 {

    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1)
            return false;
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i])
                return true;
        }

        return false;
    }

}
