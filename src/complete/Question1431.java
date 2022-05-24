package complete;

import java.util.ArrayList;
import java.util.List;

// Attempt 1 -> 05/23/2022
public class Question1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        // Determine the current highest number of candies.
        int highest = 0;
        for (int candy : candies) {
            highest = Math.max(candy, highest);
        }

        for (int candy : candies) {
            if (candy + extraCandies >= highest) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }

}
