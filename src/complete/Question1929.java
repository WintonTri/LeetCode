package complete;

// Valid -> 04/26/2022
public class Question1929 {

    public int[] getConcatenation(int[] nums) {
        int numsSize = nums.length;
        int[] ans = new int[numsSize * 2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numsSize; j++) {
                int pos = i * numsSize + j;
                ans[pos] = nums[j];
            }
        }

        return ans;
    }

}
