package complete;

// Attempt 1 -> 05/25/2022
public class Question1991 {

    public int findMiddleIndex(int[] nums) {
        int rightSum = 0;
        for (int num : nums)
            rightSum += num;

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {

            rightSum -= nums[i];

            if (leftSum == rightSum)
                return i;

            leftSum += nums[i];

        }

        return -1;
    }

}
