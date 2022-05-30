package complete;

import java.util.Arrays;

// Attempt 1 Completed -> 05/29/2022
public class Question169 {

    // The majority num occurs more than nums.length / 2 times
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // Another method would be to use a hashmap with key = number, value = occurances

}
