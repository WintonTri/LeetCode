package complete;

import java.util.HashSet;
import java.util.Set;

// Attempt 1 Completed -> 07/04/2022
public class Question1791 {

    public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        for (int[] edge : edges)
            for (int i : edge) {
                if (set.contains(i))
                    return i;
                set.add(i);
            }
        return -1;
    }

}
