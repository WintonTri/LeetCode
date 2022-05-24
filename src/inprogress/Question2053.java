package inprogress;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TODO figure out why this does not work
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

}
