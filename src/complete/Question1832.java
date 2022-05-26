package complete;

// Attempt 1 -> 05/25/2022
public class Question1832 {

    public boolean checkIfPangram(String sentence) {
        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if (sentence.indexOf(c) == -1)
                return false;
        }
        return true;
    }

}
