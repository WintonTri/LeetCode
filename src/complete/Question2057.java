package complete;

// Attempt 1 -> 05/25/2022
public class Question2057 {

    public int smallestEqual(int[] nums) {
        int smallest = -1;

        for (int i = 0; i < nums.length; i++) {
            if (i % 10 != nums[i])
                continue;

            if (smallest == -1)
                smallest = i;
            else
                smallest = Math.min(smallest, i);
        }

        return smallest;
    }

}
