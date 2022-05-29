package complete;

import java.util.Arrays;
import java.util.HashSet;

// Attempt 1 Completed -> 05/21/2022
public class Question217 {

    // This one would be efficient for space
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

    // Another approach to doing this problem
    public boolean containsDuplicateSecondAttempt(int[] nums) {
        if (nums.length <= 1)
            return false;
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i))
                return true;
            set.add(i);
        }

        return false;
    }

}
