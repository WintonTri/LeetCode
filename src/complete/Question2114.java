package complete;

// Attempt 1 & 2 Completed -> 05/19/2022
public class Question2114 {

    // Number of words per sentence = number of spaces + 1.
    // First attempt, a bit slowed compared to other solutions.
    public int mostWordsFound(String[] sentences) {
        int mostWords = 0;

        for (String sentence : sentences) {
            int spaceCount = sentence.replaceAll("[^ ]", "").length();
            mostWords = Math.max(spaceCount + 1, mostWords);
        }

        return mostWords;
    }

    // Did a second attempt since the first one is a bit slow.
    public int mostWordsFoundSecondAttempt(String[] sentences) {
        int mostWords = 0;

        for (String sentence : sentences) {
            int wordCount = 1; // Number of words per sentence = number of spaces + 1.
            for (char c : sentence.toCharArray()) {
                if (c == ' ')
                    wordCount++;
            }
            mostWords = Math.max(wordCount, mostWords);
        }

        return mostWords;
    }

}
