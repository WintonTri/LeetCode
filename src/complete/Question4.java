package complete;

import java.util.ArrayList;
import java.util.Collections;

// Attempt 1 Completed -> 05/19/2022 (This solution is very slow)
public class Question4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add to the list
        for (int i : nums1)
            list.add(i);

        for (int i : nums2)
            list.add(i);

        Collections.sort(list);
        int listSize = list.size();
        if (listSize == 0)
            return 0;

        boolean oddNum = listSize % 2 == 1;
        int midIndex = listSize / 2;

        if (oddNum)
            return list.get(midIndex);

        // Mid index would be rounded up here
        // Use -1 since the list is sorted from largest to smallest order
        return (list.get(midIndex) + list.get(midIndex - 1)) / 2.0;
    }

}
