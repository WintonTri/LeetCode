package complete;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Attempt 1 -> 05/25/2022
public class Question2032 {

    // I originally used hashmap, looked online and figured I can use Set instead
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>(), set = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
            set.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
            set.add(i);
        }
        for (int i : nums3) {
            set3.add(i);
            set.add(i);
        }
        List<Integer> result = new ArrayList<>();
        for (int i : set)
            if (set1.contains(i) && set2.contains(i) || set2.contains(i) && set3.contains(i) || set1.contains(i) && set3.contains(i))
                result.add(i);
        return result;
    }


}
