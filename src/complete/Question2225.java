package complete;

import java.util.*;

// Attempt 2 Completed -> 05/29/2022
public class Question2225 {

    // Return a list of players who never loss
    // a list of players who lost exactly once
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>(); // Player Number, Number of losses

        for (int[] i : matches) {

            // Load the player onto the map
            if (!map.containsKey(i[0])) {
                map.put(i[0], 0);
            }

            // Update loss
            if (map.containsKey(i[1])) {
                map.put(i[1], map.get(i[1]) + 1);
            } else {
                map.put(i[1], 1);
            }
        }

        List<Integer> noLostList = new ArrayList<>();
        List<Integer> oneLostList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                noLostList.add(entry.getKey());
            } else if (entry.getValue() == 1) {
                oneLostList.add(entry.getKey());
            }
        }

        Collections.sort(noLostList);
        Collections.sort(oneLostList);

        list.add(noLostList);
        list.add(oneLostList);

        return list;
    }

}
