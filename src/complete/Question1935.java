package complete;

// Attempt 2 Completed -> 05/29/2022
public class Question1935 {

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;

        for (String word : words) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (brokenLetters.indexOf(c) != -1)
                    canType = false;
            }
            if (canType)
                count++;
        }

        return count;
    }

}
