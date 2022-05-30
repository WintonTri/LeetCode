package complete;

// Attempt 2 Completed -> 05/29/2022
public class Question1974 {

    public int minTimeToType(String word) {
        int count = word.length();
        char prev = 'a';
        for (char c : word.toCharArray()) {
            int diff = Math.abs(c - prev);
            count += Math.min(diff, 26 - diff); // Min because we want the shortest path
            prev = c;
        }
        return count;
    }

}
