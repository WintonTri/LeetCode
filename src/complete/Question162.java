package complete;

// Attempt 1 Completed -> 06/05/2022
public class Question162 {

    // This function has the time complexity of logN
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1; // Pointers

        while (left < right) {
            // This is for getting the middle index
            // Do this instead of (left+right)/2 to avoid overflow in the case of large array
            int mid = left + (right - left) / 2;

            // Think about this like comparing a number on the left and the number on the right
            // If the number on the left is smaller than the number on the right,
            // Decrease the left bound to check the numbers that are on the right
            // Else the numbers on the left should be checked instead
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }

        return left;
    }

}
