package complete;

import java.util.ArrayList;

// Attempt 1 -> 05/24/2022 (I had the idea down, but had to look at hint to get the correct answer / get it working)
public class Question1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> finalIndexList = new ArrayList<>();
        int[] target = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            finalIndexList.add(index[i],nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            target[i] = finalIndexList.get(i);
        }

        return target;
    }

}
