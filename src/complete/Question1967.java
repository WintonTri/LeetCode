package complete;

// Attempt 1 Completed -> 05/21/2022
public class Question1967 {

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern))
                count++;
        }

        return count;
    }

}
