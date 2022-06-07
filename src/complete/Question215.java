package complete;

import java.util.Arrays;
import java.util.PriorityQueue;

// Attempt 1 Completed -> 06/06/2022
public class Question215 {

    public int findKthLargest(int[] nums, int k) {
        if (nums.length < k) // Invalid
            return -1;
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    // This will be faster, but use more memory
    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : nums) {
            queue.add(i);
            if (queue.size() > k)
                queue.remove();
        }

        return queue.remove();
    }

}
