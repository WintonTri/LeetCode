package complete;

// Attempt 1 Completed -> 05/29/2022
public class Question1189 {

    public int maxNumberOfBalloons(String text) {
        int[] chars = new int[26];
        for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }

        int min = chars[1]; // b
        min = Math.min(min, chars[0]); // a
        min = Math.min(min, chars[11] / 2); // l
        min = Math.min(min, chars[14] / 2); // o
        min = Math.min(min, chars[13]); // n

        return min;
    }

}
