package complete;

import java.util.Arrays;

// Attempt 1 -> 05/25/2022
public class Question1502 {

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (diff != arr[i] - arr[i - 1])
                return false;
        }

        return true;
    }

}
