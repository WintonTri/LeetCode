package complete;

// Attempt 1 Completed -> 05/20/2022
public class Question35 {

    // Needed hint
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < target) // If target number would be on the right side of mid
                low = mid + 1; // Shift the low to mid + 1
            else
                high = mid - 1; // Shift the high to mid - 1
        }
        return low;
    }


}
