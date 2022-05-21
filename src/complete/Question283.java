package complete;

// Attempt 1 Completed -> 05/21/2022
public class Question283 {

    public void moveZeroes(int[] nums) {
        int zerosCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zerosCount++;
                continue;
            }

            // This is like a swap two values method except, a whole chunk is being swapped
            // depending on the number of zeros in the previous values.
            int temp = nums[i];
            nums[i] = 0;
            nums[i - zerosCount] = temp;
        }
    }

}
