package complete;

import java.util.*;

// Attempt 1 Completed -> 06/06/2022
public class Question49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList<>();

        // Key = sorted string
        // Value = list of strings unsorted
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Adding to an already existing list
            if (map.containsKey(sorted))
                map.get(sorted).add(s);
            // Start a new list
            else
                map.put(sorted, new ArrayList<>(Collections.singletonList(s)));
        }

        return new ArrayList<>(map.values());
    }

}
