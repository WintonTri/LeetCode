package complete;

// Attempt 1 Completed -> 05/21/2022, A bit slow, but it works
public class Question1684 {

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (String word : words) {
            if (isValid(allowed, word))
                count++;
        }

        return count;
    }

    private boolean isValid(String allowed, String word) {
        for (char c : word.toCharArray())
            if (allowed.indexOf(c) == -1) // Returns -1 if it does not exist in the string
                return false;
        return true;
    }

}
