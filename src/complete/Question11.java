package complete;

// Attempt 1 & 2 Completed -> 05/20/2022
public class Question11 {

    // Time exceeds -> O(n^2)
    public int maxArea(int[] height) {
        int largest = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = 0; j < height.length; j++) {
                if (j <= i)
                    continue;

                int shortestHeight = Math.min(height[i], height[j]);
                int length = j - i;
                largest = Math.max(largest, shortestHeight * length);
            }
        return largest;
    }

    // Had to look at hint to solve this
    // Time complexity of this is O(n)
    public int maxAreaSecondAttempt(int[] height) {
        int largest = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int length = right - left;
            largest = Math.max(largest, minHeight * length);

            // Increment the height not being used
            if (height[left] > height[right])
                right--;
            else
                left++;
        }
        return largest;
    }

}
