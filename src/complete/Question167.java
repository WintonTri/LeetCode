package complete;

// Attempt 1 Completed -> 05/27/2022
public class Question167 {

    // Note: numbers is sorted in non-decreasing order
    // Constraints: Exactly 1 solution, numbers length >= 2
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        // Note: left is the side with smaller numbers
        while (left != right) {

            int sum = numbers[left] + numbers[right];
            if (sum > target) { // Need a smaller sum
                right--;
            } else if (sum < target) { // Need a larger sum
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }

        }

        throw new IllegalArgumentException("Invalid args");
    }

}
