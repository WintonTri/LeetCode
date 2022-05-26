package complete;

// Attempt 1 -> 05/25/2022
public class Question1221 {

    // Took a peek online
    public int balancedStringSplit(String s) {
        int count = 0, valueCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            // Adds 1 value if 'L', else add in -1
            valueCounter += s.charAt(i) == 'L' ? 1 : -1;

            // When this is zero, it is balanced.
            if (valueCounter == 0)
                count++;
        }
        return count;
    }

}
