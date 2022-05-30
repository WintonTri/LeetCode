package complete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Attempt 2 Completed -> 05/29/2022
public class Question2053 {

    public String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : arr) {
            if (map.containsKey(s))
                map.put(s, false);
            else
                map.put(s, true);
        }

        List<String> list = map.entrySet()
                .stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int count = list.size();
        return count < k ? "" : list.get(k - 1);
    }

    public String kthDistinct2(String[] arr, int k) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : arr) {
            if (map.containsKey(s))
                map.put(s, false);
            else
                map.put(s, true);
        }

        int distinctCounter = 0;
        for (String s : arr) {
            if (map.get(s))
                distinctCounter++;
            if (distinctCounter == k)
                return s;
        }

        return "";
    }

}
