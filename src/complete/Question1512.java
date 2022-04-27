package complete;

// Valid -> 04/26/2022
public class Question1512 {

    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;

        int numsSize = nums.length;
        for (int i = 0; i < numsSize; i++) {
            for (int j = i; j < numsSize; j++) {
                if (nums[i] == nums[j] && i < j)
                    pairs++;
            }
        }

        return pairs;
    }

}
