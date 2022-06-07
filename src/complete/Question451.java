package complete;

import java.util.HashMap;
import java.util.PriorityQueue;

// Attempt 1 Completed -> 06/06/2022
public class Question451 {

    public String frequencySort(String s) {
        // Key = char
        // Value = occurrences
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        // Have a way to get it sorted by largest num of occurrences
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder stringBuilder = new StringBuilder();
        while (!maxHeap.isEmpty()){
            char c = maxHeap.poll();
            for (int i = 0; i < map.get(c); i++)
                stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

}
