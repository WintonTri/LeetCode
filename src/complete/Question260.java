package complete;

import java.util.HashMap;
import java.util.Map;

// Attempt 1 Completed -> 06/17/2022
public class Question260 {

    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int[] res = new int[2];
        int pos = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                res[pos] = entry.getKey();
                pos++;
            }
        }

        return res;
    }

}
