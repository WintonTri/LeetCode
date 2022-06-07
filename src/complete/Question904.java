package complete;

import java.util.HashMap;

// Attempt 1 Completed -> 06/06/2022
public class Question904 {

    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0)
            return 0;

        // Key - Fruit type
        // Value - Last occurrence index
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFruits = 1; // Have at least one fruit
        int i = 0, j = 0; // Pointers

        while (j < fruits.length) { // Check each tree
            map.put(fruits[j], j); // Put the last occurrence of fruit
            j++;

            if (map.size() > 2) { // Too many types of fruits
                int min = fruits.length - 1; // Referring to the index
                for (int val : map.values()) {
                    min = Math.min(min, val);
                }

                i = min + 1;
                map.remove(fruits[min]); // Remove this type of fruit from the hash map
            }

            // Note how there are two pointers j and i
            // there is two because maximum number of fruits allowed is two
            maxFruits = Math.max(maxFruits, j - i);
        }

        return maxFruits;
    }

}
