package complete;

import java.util.ArrayList;

// Attempt 1 Completed -> 05/19/2022
public class Question1313 {

    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i+=2) {
            int freq = nums[i - 1];
            int val = nums[i];
            for (int j = 0; j < freq; j++)
                list.add(val);
        }
        // Convert to array
        int arrSize = list.size();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++)
            arr[i] = list.get(i);
        return arr;
    }

}
