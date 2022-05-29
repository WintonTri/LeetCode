package complete;

import java.util.HashMap;
import java.util.Map;

// Attempt 1 & 2 Completed -> 05/29/2022
public class Question1 {

    // Brute force method
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // O(n)
    // This could be cleaned up to use less memory
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int valueNeeded = target - nums[i];
            if (map.containsKey(valueNeeded)) {
                int key = map.get(valueNeeded);
                return new int[]{key, i};
            }
            map.put(nums[i], i); // Key = value, Value = index
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
