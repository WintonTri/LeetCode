package complete;

import java.util.Arrays;

// Attempt 1 Completed -> 05/19/2022 (Look at a hint online)
public class Question2160 {

    public int minimumSum(int num) {
        int[] arr = new int[4]; // num will always have 4 digits

        // Load the 4 digits in num into arr, order doesn't matter
        int newNum = num;
        for (int i = 0; i < 4; i++) {
            arr[i] = newNum % 10; // Add last digit
            newNum = newNum / 10; // Remove last digit
        }

        Arrays.sort(arr);

        // Example: If numbers are 1,2,3,4
        // Smallest sum would be 13 + 24,
        // 13 -> indices 0,2
        // 24 -> indices 1,3
        return arr[0] * 10 + arr[2] + arr[1] * 10 + arr[3];
    }
}
