package complete;

// Attempt 1 Completed -> 05/21/2022
public class Question1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder firstBuilder = new StringBuilder(), secondBuilder = new StringBuilder();

        for (String s : word1)
            firstBuilder.append(s);

        for (String s : word2)
            secondBuilder.append(s);

        return firstBuilder.toString().equals(secondBuilder.toString());
    }

}
