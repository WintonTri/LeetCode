package complete;

import java.util.*;

// Attempt 1 Completed -> 05/29/2022
public class Question15 {

    // Returns a list of a list that each contains three elements
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>(); // A set is used instead of arraylist to avoid duplicates
        if (nums.length <= 2) // Need 3+ elements to return non-empty list
            return new ArrayList<>();
        Arrays.sort(nums);

        // Subtract two because 3 numbers are in a triplet
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1; // These will act as pointers
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                } else if (sum > 0) { // Need to make the number smaller
                    right--;
                } else {
                    left++;
                }
            }
        }

        return new ArrayList<>(list);
    }


}
