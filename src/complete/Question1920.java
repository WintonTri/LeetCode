package complete;

// Attempt 1 Completed -> 05/19/2022

public class Question1920 {

    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int num : nums)
            arr[num] = nums[nums[num]];
        return arr;
    }

}
