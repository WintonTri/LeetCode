package complete;

import java.util.HashMap;

// Attempt 1 Completed -> 06/05/2022
public class Question137 {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Load the map
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Check for single occurrence
        for (int key : map.keySet())
            if (map.get(key) == 1)
                return key;

        return -1;
    }

    // Invalid
//    public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        int counter = 1, prevNum = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != prevNum) {
//                if (counter == 1)
//                    return prevNum;
//                prevNum = nums[i];
//            }
//            counter++;
//        }
//
//        return prevNum;
//    }



}
