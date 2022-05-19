package complete;

// Attempt 1 Completed -> 05/19/2022
// For a faster solution, maybe sort the array and then determine the count
// based on the indices?
public class Question1365 {

    // First attempt
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int numLength = nums.length;
        int[] arr = new int[numLength];
        for (int i = 0 ; i < numLength; i++) {
            int count = 0;
            for (int j : nums) {
                if (j < nums[i])
                    count++;
            }
            arr[i] = count;
        }
        return arr;
    }


}
