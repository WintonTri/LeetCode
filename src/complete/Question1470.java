package complete;

// Attempt 1 Completed -> 05/19/2022
public class Question1470 {

    public int[] shuffle(int[] nums, int n) {
        // Multiply by 2 since n is half the length of nums array.
        // Note: length of nums will always be an even number.
        int[] arr = new int[2 * n];

        // Note: Multiplying by two since two elements are being set per iteration.
        for (int i = 0; i < n; i++) {
            arr[i * 2] = nums[i];
            arr[i * 2 + 1] = nums[i + n];
        }

        return arr;
    }

}
