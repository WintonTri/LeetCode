package complete;

// Attempt 1 Completed -> 05/21/2022, had to look at a hint
public class Question26 {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 1; i < n; i++) {
            // If the prev numbers are the same, do not shift it over
            // this duplicate number will be deleted later on in the loop
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        return n - count;
    }

}
